package Data.repository;

import Data.model.Entry;

public interface EntryRepository {
    Entry save(Entry entry);
    Entry findById(int entryId);
    long count ();

    void deleteById(int entryId);
    long entryIsEmpty(int id);
}
