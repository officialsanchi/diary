package Data.repository;

import Data.model.Entry;

import java.util.ArrayList;

public class EntryRepositoryImpl implements EntryRepository {
    ArrayList<Entry> entries = new ArrayList<>();

    @Override
    public Entry save(Entry entry) {
        entries.add(entry);
        return entry;
    }

    @Override
    public Entry findById(String entryId) {
        for(Entry entry: entries){
            if(entry.getTitle().equals(entryId))return entry;
        }
        return null;
    }

    @Override
    public void deleteById(String entryId) {
        for(Entry entry: entries){
            if(entry.getTitle().equals(entryId)){
                entries.remove(entry);
                break;
            }
        }
    }
}
