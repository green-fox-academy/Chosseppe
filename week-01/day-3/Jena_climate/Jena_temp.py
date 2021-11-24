import os
import numpy as np
from matplotlib import pyplot as plt
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Flatten, Dense
from tensorflow.keras.optimizers import RMSprop
 
data_dir = '/Users/prouderjoe/Desktop/Python/Deep_learning_with_python/Jena_climate'
fname = os.path.join(data_dir, 'jena_climate_2009_2016.csv')
 
f = open(fname)
data = f.read()
f.close()

lines = data.split('\n')
header = lines[0].split(',')
lines = lines[1:]
 
float_data = np.zeros((len(lines), len(header) - 1))
for i, line in enumerate(lines):
    values = [float(x) for x in line.split(',')[1:]]
    float_data[i, :] = values
    
 
temp = float_data[:, 1]  # temperature (in degrees Celsius)
plt.plot(range(len(temp)), temp)
plt.show()
 
plt.plot(range(1440), temp[:1440])
plt.show()
 
mean = float_data[:200000].mean(axis = 0)
float_data -= mean
std = float_data[:200000].std(axis = 0)
float_data /= std
 
def generator(data, lookback, delay, min_index, max_index,
              shuffle = False, batch_size = 128, step = 6):
    if max_index is None:
        max_index = len(data) - delay - 1
    i = min_index + lookback
    while 1:
        if shuffle:
            rows = np.random.randint(
                min_index + lookback, max_index, size = batch_size)
        else:
            if i + batch_size >= max_index:
                i = min_index + lookback
            rows = np.arange(i, min(i + batch_size, max_index))
            i += len(rows)

        samples = np.zeros((len(rows),
                            lookback // step,
                            data.shape[-1]))
        targets = np.zeros((len(rows),))
        for j, row in enumerate(rows):
            indices = range(rows[j] - lookback, rows[j], step)
            samples[j] = data[indices]
            targets[j] = data[rows[j] + delay][1]
        yield samples, targets
 
lookback = 1440
step = 6
delay = 144
batch_size = 128
 
train_gen = generator(float_data,
                      lookback = lookback,
                      delay = delay,
                      min_index = 0,
                      max_index = 200000,
                      shuffle = True,
                      step = step, 
                      batch_size = batch_size)
val_gen = generator(float_data,
                     lookback = lookback,
                     delay = delay,
                     min_index = 200001,
                     max_index = 300000,
                     step = step,
                     batch_size = batch_size)
test_gen = generator(float_data,
                     lookback = lookback,
                     delay = delay,
                     min_index = 300001,
                     max_index = None,
                     step = step,
                     batch_size = batch_size)
 
val_steps = (300_000 - 200_001 - lookback) // batch_size
test_steps = (len(float_data) - 300_001 - lookback) // batch_size
print(val_steps)
 
def evaluate_naive_method():
    batch_maes = []
    for step in range(val_steps):
        print('Step 1')
        samples, targets = next(val_gen)
        print('Step 2')
        preds = samples[:, -1, 1]
        print('Step 3')
        mae = np.mean(np.abs(preds - targets))
        print('Step 4')
        batch_maes.append(mae) 
    print(np.mean(batch_maes))
    
evaluate_naive_method()

model = Sequential()
model.add(Flatten(input_shape = (lookback // step, float_data.shape[-1])))
model.add(Dense(32, activation = 'relu'))
model.add(Dense(1))
model.compile(optimizer = RMSprop(), loss = 'mae')

history = model.fit(train_gen,
                             steps_per_epoch = 500,
                             epochs = 20,
                             validation_data = val_gen,
                             validation_steps = val_steps)

loss = history.history['loss']
val_loss = history.history['val_loss']

epochs = range(1, len(loss) + 1)

plt.figure()
plt.plot(epochs, loss, 'bo', label = 'Training loss')
plt.plot(epochs, val_loss, 'b', label = 'Validation loss')
plt.title('Training and validation loss')
plt.legend()

plt.show()