package Service;

import Data.model.Diary;

public interface DiaryService {
    void createAccount(Diary diary);

    long diaryCount();
}
