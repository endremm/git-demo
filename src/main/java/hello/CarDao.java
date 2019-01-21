package hello;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDao {

    public List<String> getCarNames() {
        return List.of("Honda", "Ford");
    }

    public boolean isCarName(String name) {
        return name.startsWith("Car");
    }

}
