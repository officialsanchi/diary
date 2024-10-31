import Data.model.Diary;
import Data.repository.DiariesRepository;
import Data.repository.DiariesRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DiariesRepositoryTest {
    private DiariesRepository diariesRepository = new DiariesRepositoryImpl();

    @BeforeEach
    public void startWith(){

    }

    @Test
    public void testThatDiaryIsEmptyThatCreation(){

        assertEquals(diariesRepository.count(),0);

    }
    @Test
    public void testThatICanCreateADiary(){

        Diary diary = new Diary("userName","password",1);
        diariesRepository.save(diary);
        assertEquals(diariesRepository.count(),1l);
    }
    @Test
    public void testThatYouCanGetADiaryFromRepository(){
        Diary diary = new Diary("userName","password",1);
        diariesRepository.save(diary);
        Diary expected = diariesRepository.getId(1);
        assertEquals("userName",expected.getUserName());

    }
    @Test
    public void testThatIHaveThreeDiaries(){
        Diary diary = new Diary("userName","passwrod",1);
        diariesRepository.save(diary);
        Diary diary2 = new Diary("chidinma","pin",1);
        diariesRepository.save(diary2);
        Diary diary3 = new Diary("obioma","code",1);
        diariesRepository.save(diary3);
        assertEquals(diariesRepository.count(),3l);


    }
    @Test
    public void testThatICanDeleteDiary(){

        Diary diary = new Diary("userName","passwrod",1);
        diariesRepository.save(diary);
        Diary diary2 = new Diary("chidinma","pin",2);
        diariesRepository.save(diary2);
        Diary diary3 = new Diary("obioma","code",3);
        diariesRepository.save(diary3);
        assertEquals(diariesRepository.count(),3l);
        diariesRepository.delete(2);
        assertNull(diariesRepository.getId(2));
        assertEquals(diariesRepository.count(),2l);



    }

    }


