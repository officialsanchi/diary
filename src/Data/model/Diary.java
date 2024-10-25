package Data.model;

import java.util.ArrayList;

public class Diary {
    private String UserName;
    private String password;
    private boolean isLocked;
    ArrayList<Entry> entries = new ArrayList<>();


    public Diary(String userName, String password) {
        UserName = userName;
        this.password = password;


    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }


}
