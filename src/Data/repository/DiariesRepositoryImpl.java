package Data.repository;

import Data.model.Diary;

import java.util.ArrayList;

public class DiariesRepositoryImpl implements DiariesRepository {

    ArrayList<Diary> diaries = new ArrayList<>();


    @Override
    public Diary createUser(String name, String password) {
        Diary diary = new Diary("username","password");
        diary.setUserName("Chi");
        diary.setPassword("9876");
        diaries.add(diary);
        return diary;
    }
}
