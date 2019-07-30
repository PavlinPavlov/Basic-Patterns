package observer;

public class Subscriber implements Observer{

    private String name;
    private Subject blog;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Post post = blog.getUpdate();
        System.out.printf("%s read: %s from %s, published %s\n",
                this.name, post.getContent(), post.getAuthor(), post.getPublishDate());
    }

    @Override
    public void setSubject(Subject sub) {
        this.blog = sub;
    }
}
