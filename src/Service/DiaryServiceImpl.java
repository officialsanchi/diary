package Service;

import Data.model.Diary;
import Data.repository.DiariesRepository;
import Data.repository.DiariesRepositoryImpl;


public class DiaryServiceImpl implements DiaryService {
    DiariesRepository diaryRepository = new DiariesRepositoryImpl();
    private final EntryService entryService = new EntryServiceImpl();
    private int count;

    @Override
    public boolean isLocked(int id) {
        Diary diary = getId(id);
        return diary.isLocked();
    }

    @Override
    public void unLocked(int id) {
        Diary diary = getId(id);
        diary.setLocked(false);

    }

    @Override
    public void lockedDiary(int id) {
        Diary diary = getId(id);
        diary.setLocked(true);

    }



    @Override
    public Diary createDiary(String username, String password) {
        int id = generateId();
        Diary diary = new Diary(username, password, id);
        diary.setUserName(username);
        diary.setPassword(password);
        return diaryRepository.save(diary);

    }

    private int generateId() {
        return ++count;
    }

    @Override
    public long diaryCount() {
        return this.count;
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



    @Override
    public void removeEntry(String userName, String entryId) {

    }

    @Override
    public Diary getId(int id) {
        return diaryRepository.getId(id);
    }

    @Override
    public Diary save(Diary diary) {
        return null;
    }
}
