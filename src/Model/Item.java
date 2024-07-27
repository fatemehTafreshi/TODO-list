package Model;

import java.time.LocalDateTime;

public class Item {
    private long id;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private boolean done;
    private LocalDateTime doneDate;
    private byte priority;

    public Item() {}

    public Item(long id, String title, String description, LocalDateTime createDate, boolean done, LocalDateTime doneDate, byte priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.done = done;
        this.doneDate = doneDate;
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDoneDate(LocalDateTime doneDate) {
        this.doneDate = doneDate;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDateTime getDoneDate() {
        return doneDate;
    }

    public byte getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Item { " +
                " id : " + id +
                ", title : " + title + "\'" +
                ", description : " + description + "\'" +
                ", createdDate : " + createDate +
                ", Done :  " + done +
                ", doneDate : " + doneDate +
                ", priority : " + priority +
                "}"
                ;
    }
}
