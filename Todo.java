import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Todo {

    // userId
    @JsonProperty("userId")
    int userId;

    @JsonGetter("userId")
    public int getuserId() {
        return userId;
    }

    @JsonSetter("userId")
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // title
    @JsonProperty("title")
    String title;

    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    // id
    @JsonProperty("id")
    int id;

    @JsonGetter("id")
    public int getId() {
        return id;
    }

    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    // completed
    @JsonProperty("completed")
    boolean completed;

    @JsonGetter("completed")
    public boolean getcompleted() {
        return completed;
    }

    @JsonSetter("completed")
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "id: " + id + "; title: " + title + "\n";
    }
}
