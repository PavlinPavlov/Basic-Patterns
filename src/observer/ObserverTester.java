package observer;

public class ObserverTester {
    public static void main(String[] args) {
        Blog blog = new Blog();

        Observer sub1 = new Subscriber("Mark");
        Observer sub2 = new Subscriber("Veronica");
        Observer sub3 = new Subscriber("Atanas");

        blog.subscribe(sub1);
        blog.subscribe(sub2);
        blog.subscribe(sub3);

        blog.createNewPost(new Post("John Smith", "Random content"));
        System.out.println();
        blog.createNewPost(new Post("Ron James", "Blah blah"));
    }
}
