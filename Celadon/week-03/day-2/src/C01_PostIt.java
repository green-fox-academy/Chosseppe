public class C01_PostIt {

    public static class PostIt {

        String backgroundColor;
        String text;
        String textColor;

    }

    public static void main(String[] args) {

        PostIt postit_1 = new PostIt();
        postit_1.backgroundColor = "orange";
        postit_1.text = "Idea 1";
        postit_1.textColor = "blue";

        PostIt postit_2 = new PostIt();
        postit_2.backgroundColor = "pink";
        postit_2.text = "Awesome";
        postit_2.textColor = "black";

        PostIt postit_3 = new PostIt();
        postit_3.backgroundColor = "yellow";
        postit_3.text = "Superb!";
        postit_3.textColor = "green";

    }
}
