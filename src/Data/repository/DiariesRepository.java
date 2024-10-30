package Data.repository;

import Data.model.Diary;

public interface DiariesRepository {

    Diary createUser(String name, String password);
    void addDiary(Diary diary);
    long diaryCount();

    boolean isLocked(String id);

    void unLocked(String id);

    void Locked(String id);

    void removeEntry(String id, String entryId);

    Diary save(Diary diary);
}
