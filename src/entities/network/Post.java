package entities.network;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String comment;
    private Integer like;
    private List<Comment> comments = new ArrayList<>();

    public Post(String s, String traveling_to_new_zealand, String comment, int like){
    }

    public Post(Date moment, String title, String comment, Integer like) {
        this.moment = moment;
        this.title = title;
        this.comment = comment;
        this.like = like;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title + "\n");
        builder.append(like );
        builder.append("Likes - " );
        builder.append(sdf.format(moment) + "\n");
        builder.append(comment + "\n");
        builder.append("Comments: \n");

        for (Comment c : comments) {
            builder.append(c.getText());
        }
        return builder.toString();
    }
}
