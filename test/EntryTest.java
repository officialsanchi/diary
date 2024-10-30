import Data.repository.EntryRepository;
import Data.repository.EntryRepositoryImpl;
import Service.EntryService;
import Service.EntryServiceImpl;
import Data.model.Entry;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {


    private EntryService entryService = new EntryServiceImpl();

    public void testThatEntryCanBeCreated(){
         Entry entry = new Entry(23, "don't give a fuck", "body");
        entryService.createEntry(entry.getTitle(),entry.getBody());
//        assertEquals()
    }

}
