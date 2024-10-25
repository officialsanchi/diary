package Service;

import Data.model.Diary;
import Data.repository.DiaryRepository;
import Data.repository.DiaryRepositoryImpl;

public class DiaryServiceImpl implements DiaryService {
    DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    @Override
    public void createAccount(Diary diary) {

    }

    @Override
    public long diaryCount() {
        return diaryRepository.diaryCount();
    }
}
