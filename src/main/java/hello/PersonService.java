package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        // More comments
        this.personDao = personDao;
    }

    public List<String> getAllPersons() {
        // Some comment with tweaks
        return personDao.getAllPersons();
    }

}
