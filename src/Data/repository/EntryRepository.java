package Data.repository;

import Data.model.Entry;

public interface EntryRepository {
    Entry save(Entry entry);
    Entry findById(String entryId);

    void deleteById(String entryId);
}
