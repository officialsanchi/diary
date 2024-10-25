package Data.repository;

import Data.model.Diary;

public interface DiariesRepository {
    Diary createUser(String name, String password);


}
