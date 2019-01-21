package hello;

import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Collections.emptyList;

@Repository
public class CarDao {

    public List<String> getCarNames() {
        return emptyList();
    }

}
