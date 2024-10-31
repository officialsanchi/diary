package Service;

import Data.model.Diary;

public interface DiaryService {

    Diary createDiary(String username, String password);

    long diaryCount();

    boolean isLocked(int id);

    void unLocked(int id);

    void lockedDiary(int id);

    long deleteEntry(int id);

    void findEntryById();

    void removeEntry(String userName, String entryId);

    Diary getId(int id);

    Diary save(Diary diary);
}
