public class A13_Reverse_list {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements of `numbers`
    // - Print the elements of the reversed `numbers`
    public static void main(String[] args) {

        int[] numbers={3,4,5,6,7};

        Reverse(numbers);

        for(int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void Reverse(int x[]){
        int[] temp = new int[x.length];
        for(int a=0; a<x.length; a++){
            temp[a] = x[a];
        }
        
        for(int i = 0; i<x.length; i++){
            x[x.length -1 -i] =temp[i];
        }
    }

}
