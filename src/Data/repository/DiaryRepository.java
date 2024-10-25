package Data.repository;

import Data.model.Diary;

public interface DiaryRepository {
    void addDiary(Diary diary);
    long diaryCount();
}
