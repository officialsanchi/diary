package Data.repository;

import Data.model.Diary;

public interface DiariesRepository {

    long count();


    void delete(int id);

    Diary getId(int id);

    Diary save(Diary diary);
}
