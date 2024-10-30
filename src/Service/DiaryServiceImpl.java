package Service;

import Data.model.Diary;
import Data.repository.DiariesRepository;
import Data.repository.DiariesRepositoryImpl;


public class DiaryServiceImpl implements DiaryService {
    DiariesRepository diaryRepository = new DiariesRepositoryImpl();
    private final EntryService entryService = new EntryServiceImpl();
    private long count;

    @Override
    public Diary createDiary(String username, String password) {
        Diary diary = new Diary();
        diary.setUserName(username);
        diary.setPassword(password);
        return diaryRepository.save(diary);

    }

    @Override
    public long diaryCount() {
        return this.count;
    }
    @Override
    public void createEntry(String title, String body) {
        entryService.createEntry(title, body);
        count++;

    }

    @Override
    public boolean locked(String id) {
       return diaryRepository.isLocked(id);

    }

    @Override
    public void unLocked(String id) {
        diaryRepository.unLocked(id);
    }

    @Override
    public boolean isLocked(String id) {
        return diaryRepository.isLocked(id);
    }

    @Override
    public long deleteEntry(int id) {
        for(int count = 0; count <= id; count++){
        }
        return 0;
    }
    @Override
    public void findEntryById() {
    }



}
