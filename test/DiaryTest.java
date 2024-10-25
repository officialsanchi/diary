import Data.model.Diary;
import Data.repository.DiariesRepository;
import Data.repository.DiaryRepository;
import Data.repository.DiaryRepositoryImpl;
import Service.DiaryService;
import Service.DiaryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
        private Diary diary;
        private DiaryService diaryService = new DiaryServiceImpl();
        private DiaryRepository diaryRepository = new DiaryRepositoryImpl();

        @BeforeEach
        public void startWith(){
            diary = new Diary("joy","234");

        }

        @Test
        public void testThatDiaryIsEmpty(){
            long diaryCount = diaryService.diaryCount();
            assertEquals(0, diaryCount);
        }

//        @Test

//        public void createDiaryTest(){
//
//            diaryService.createAccount(diary);
//            assertEquals(diaryRepository.)
//
//
//
//        }

    }


