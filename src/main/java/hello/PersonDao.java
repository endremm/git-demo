package hello;

import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Collections.emptyList;

@Repository
public class PersonDao {

    public List<String> getAllPersons() {
        return emptyList();
    }

}
