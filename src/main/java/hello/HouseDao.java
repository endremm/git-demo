package hello;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

@Repository
public class HouseDao {

    public List<String> getHouseNames() {
        return emptyList();
    }
}
