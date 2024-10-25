package Data.model;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private  String body;
    private final LocalDate today = LocalDate.now();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getToday() {
        return today;
    }

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }


}
