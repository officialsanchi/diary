import Data.model.Entry;
import Data.repository.EntryRepository;
import Data.repository.EntryRepositoryImpl;
import org.junit.jupiter.api.Test;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryRepositoryTest {
    private EntryRepository entryRepository = new EntryRepositoryImpl();


    @Test
    public void testThatEntryIsEmptyThatCreation(){
       Entry entry = new Entry(1,"title","body");
       entryRepository.save(entry);
        assertEquals(entryRepository.count(),1);
    }





}
