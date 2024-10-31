package Data.repository;
import Data.model.Diary;
import Data.model.Entry;
import Service.DiaryService;

import java.util.ArrayList;

public class DiariesRepositoryImpl implements DiariesRepository{
    ArrayList<Diary> diaries = new ArrayList<>();
    public long count = 0;


    @Override
    public long count() {
        return count;
    }
    @Override
    public void delete(int id) {
        for(int count = 0; count < diaries.size(); count++){
            if(diaries.get(count).getId() == id){
                diaries.remove(count);
                break;
            }
        }
        count--;

    }

    @Override
    public Diary getId(int id) {
        for(int count = 0; count < diaries.size(); count++){
            if(diaries.get(count).getId() == id){
                return diaries.get(count);
            }
        }
        return null;
    }

    @Override
    public Diary save(Diary diary) {
        diaries.add(diary);
        count++;
        return diary;
    }
}
