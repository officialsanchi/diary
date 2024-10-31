package Service;

import Data.model.Entry;
import Data.repository.EntryRepository;

public class EntryServiceImpl implements EntryService{
    private EntryRepository entryRepository;

    @Override
    public Entry createEntry(String title, String body) {
        Entry entry = new Entry();
        entry.setBody(body);
        entry.setTitle(title);
        return entryRepository.save(entry);
    }

    @Override
    public long entryIsEmpty() {
        return 0;
    }
}
