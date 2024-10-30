package Service;

import Data.model.Diary;

public interface DiaryService {

    Diary createDiary(String username, String password);
    long diaryCount();

    void createEntry(String title, String body);

    boolean locked(String id);
    void unLocked(String id);
    boolean isLocked(String id);

    long deleteEntry(int id);


    void findEntryById();
}
