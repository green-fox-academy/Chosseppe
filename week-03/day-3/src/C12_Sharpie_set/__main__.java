package C12_Sharpie_set;

public class __main__ {
    public static void main(String[] args) {

        SharpieSet sharpieslist = new SharpieSet();

        Sharpie sharpi1 = new Sharpie();
        Sharpie sharpi2 = new Sharpie();
        Sharpie sharpi3 = new Sharpie();
        Sharpie sharpi4 = new Sharpie();

        for( int i =0 ; i < 10; i++){
            sharpi2.use();
            sharpi4.use();
        }

        sharpieslist.add(sharpi1);
        sharpieslist.add(sharpi2);
        sharpieslist.add(sharpi4);
        sharpieslist.add(sharpi3);

        for(int i = 0; i < sharpieslist.listOfSharpies.size();  i++) {
            System.out.println(sharpieslist.listOfSharpies.get(i));
        }
        sharpieslist.countUsable();
        sharpieslist.removeTrash();
        for(int i = 0; i < sharpieslist.listOfSharpies.size();  i++){
            System.out.println(sharpieslist.listOfSharpies.get(i));
        }


    }
}
