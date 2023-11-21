package project.database;

import java.util.HashMap;
import java.util.Map;

public class CityWeatherDb {

    private static final Map<Long, CityDataEntity> dataBase = new HashMap<>();

    public void add(CityDataEntity entity) {
        dataBase.put(entity.getId(), entity);
    }

    public void remove(CityDataEntity entity) {
        dataBase.remove(entity.getId(), entity);
    }

    public void modify(CityDataEntity entity) {
        dataBase.replace(entity.getId(), entity);
    }
}
