package Data.repository;

import Data.model.Diary;
import Data.model.Entry;

import java.util.ArrayList;

public class DiariesRepositoryImpl implements DiariesRepository {
    ArrayList<Diary> diaries = new ArrayList<>();
    private EntryRepository entryRepository;
    public long count = 0;

    @Override
    public void addDiary(Diary diary) {
        diaries.add(diary);
        this.count++;
    }

    public Diary findById(String id){
        for(Diary dairy: diaries){
            if( dairy.getUserName().equals(id))return dairy;
        }
        return null;
    }


    @Override
    public Diary createUser(String name, String password) {
        Diary diary = new Diary(name,password);
        diary.setUserName(name);
        diary.setPassword(password);
        return diary;
    }

    @Override
    public long diaryCount() {
        return this.count;
    }

    @Override
    public boolean isLocked(String name) {
        Diary diary = findById(name);

        return diary.isLocked();
    }
    @Override
    public void unLocked(String  id) {
        Diary diary = findById(id);;
        diary.setLocked(false);
    }

    @Override
    public void Locked(String id) {
        Diary diary = findById(id);;
        diary.setLocked(true);
    }


    @Override
    public void removeEntry(String id, String entryId) {
    Diary diary = findById(id);
    Entry entry = entryRepository.findById(entryId);
   diary.getEntries().remove(entry);
   entryRepository.deleteById(entryId);
        this.count--;
        diaries.remove(diary);
    }

    @Override
    public Diary save(Diary diary) {

        return null;
    }

//    @Override
//    public void removeEntry(String name, String password) {
//        Diary diary = new Diary();
//        this.count--;
//        diaries.remove(diary);
//    }


}
