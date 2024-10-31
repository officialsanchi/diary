import Data.model.Diary;
import Service.DiaryService;
import Service.DiaryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceTest {
    private DiaryService diaryService = new DiaryServiceImpl();

    @BeforeEach
    public void startWith(){

    }

    @Test
    public void testThatDiaryIsOpenOrClosedAtCreation(){
        Diary diary = diaryService.createDiary("username","password");
        assertTrue(!diary.isLocked());
    }
    @Test
    public void testThatDiaryIsOpenAtCreationAndIsLockedAfterCreation(){
        Diary diary = diaryService.createDiary("username","password");
        assertFalse(diaryService.isLocked(1));
        diaryService.lockedDiary(1);
        assertTrue(diaryService.isLocked(1));
    }
    @Test
    public void testThatWhenDiaryIsLockedThatDiaryCanBeUnlocked(){
        Diary diary = diaryService.createDiary("username","password");
        assertFalse(diaryService.isLocked(1));
        diaryService.lockedDiary(1);
        assertTrue(diaryService.isLocked(1));
        diaryService.unLocked(1);
        assertFalse(diaryService.isLocked(1));
        Diary diary1 =  diaryService.createDiary("userName2","password2");
        assertFalse(diaryService.isLocked(2));

    }
}
