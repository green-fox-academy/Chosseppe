public class C02_Blog_Post {

    public static class BlogPost{
        String authorName;
        String title;
        String text;
        String publicationDate;
    }

    public static void main(String[] args) {

        BlogPost blogpost_01 = new BlogPost();

        BlogPost blogpost_11 = new BlogPost();

        BlogPost blogpost_96 = new BlogPost();


        blogpost_01.authorName = "John Doe";
        blogpost_01.title = "Lorem Ipsum";
        blogpost_01.publicationDate = "2000.05.04";
        blogpost_01.text = "Lorem ipsum dolor sit amet.";

        blogpost_11.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blogpost_11.authorName = "Tim Urban";
        blogpost_11.title = "Wait but why";
        blogpost_11.publicationDate = "2010.10.10";

        blogpost_96.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogpost_96.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                " When I asked to take his picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer profile thing.";
        blogpost_96.publicationDate = "2017.03.28";
        blogpost_96.authorName = "William Turton";
    }
}
