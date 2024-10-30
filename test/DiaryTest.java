import Data.model.Diary;
import Data.repository.DiariesRepository;
import Data.repository.DiariesRepositoryImpl;
import Service.DiaryService;
import Service.DiaryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
        private Diary diary;
        private DiaryService diaryService = new DiaryServiceImpl();
        private DiariesRepository diaryRepository = new DiariesRepositoryImpl();

        @BeforeEach
        public void startWith(){
            diary = new Diary("joy","234");
        }

    @Test
    public void testThatDiaryIsEmpty(){
        long diaryCount = diaryService.diaryCount();
        assertEquals(0, diaryCount);
    }


        @Test
    public void diaryLockedTest(){
            Diary diary = new Diary();
            diaryService.locked();
            assertTrue(diaryService.unLocked());
        }
        @Test
    public void diaryUnLockedTest(){
            Diary diary = new Diary();
            diaryService.unLocked();
            assertFalse(diaryService.locked());
        }
        @Test
    public void diaryIsLockedTest(){
            Diary diary = new Diary();
            diaryService.isLocked();
            assertFalse(diaryService.isLocked());
        }

    @Test
    public void diaryEntryCreationTest(){
        Diary diary1 = new Diary();
        diaryService.createEntry("adam","1234");
        assertEquals(diaryService.diaryCount(),1);

    }
    @Test
    public void diaryEntriesCreationTest() {
        Diary diary1 = new Diary();
        diaryService.createEntry("adam", "1234");
        diaryService.createEntry("chidinma", "2345");
        diaryService.createEntry("chiamaka", "5678");
        diaryService.createEntry("jonah","5678");
        assertEquals(diaryService.diaryCount(), 4);
    }
        @Test
    public void createFourEntryTest(){
            Diary diary = new Diary();
            diaryService.createEntry("adam", "1234");
            diaryService.createEntry("chidinma", "2345");
            diaryService.createEntry("chiamaka", "5678");
            diaryService.createEntry("jonah","5678");
            assertEquals(diaryService.diaryCount(), 4);
//            assertEquals(diaryService.deleteEntry(),3);
//            assertEquals(diaryService.deleteEntry(),2);

        }

        @Test

    public void findEntryByIdTest(){
            Diary diary = new Diary();
            diaryService.findEntryById();
        }

    }


