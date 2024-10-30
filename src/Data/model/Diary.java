package Data.model;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    ArrayList<Entry> entries = new ArrayList<>();


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;


    }

    public Diary(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public boolean locked(boolean locked){
        this.isLocked = false;

        return locked;
    }
    public  boolean unlocked(boolean unlocked){
       this.isLocked = true;
        return unlocked;
    }


}
