package observer;

import java.util.Date;

class Post {

    private final String author;
    private final String content;
    private final Date publishDate;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.publishDate = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
