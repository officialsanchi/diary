package Data.repository;

import Data.model.Diary;

import java.util.ArrayList;

public class DiaryRepositoryImpl implements DiaryRepository{
    ArrayList<Diary> diaryRepo = new ArrayList<>();
    private long count = 0;

    @Override
    public void addDiary(Diary diary) {
        diaryRepo.add(diary);
        count++;
    }

    @Override
    public long diaryCount() {
        return count;
    }

}
