package Data.repository;

import Data.model.Entry;
import java.util.ArrayList;

public class EntryRepositoryImpl implements EntryRepository {
    ArrayList<Entry> entries = new ArrayList<>();
    private int count;

    @Override
    public Entry save(Entry entry) {
        entries.add(entry);
        count++;
        return entry;
    }



    @Override
    public Entry findById(int entryId) {
        for(Entry entry: entries){
            if(entry.getId()==entryId)return entry;
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public void deleteById(int entryId) {
        for(Entry entry: entries){
            if(entry.getId()==entryId){
                entries.remove(entry);
                break;
            }
        }
    }

    @Override
    public long entryIsEmpty(int id) {
        return 0;
    }


}
