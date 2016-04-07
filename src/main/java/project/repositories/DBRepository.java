package project.repositories;

import com.google.common.collect.Maps;

import java.util.Map;

public class DBRepository {

    Map<String, String> dataFromDB;

    public DBRepository(){
        dataFromDB = Maps.newHashMap();
        dataFromDB.put("1", "item1");
        dataFromDB.put("2", "item2");
        dataFromDB.put("3", "item3");
    }

    public SearchResult searchFor(String searchTerm) {
        String result = dataFromDB.get(searchTerm);
        return new SearchResult(result);
    }
}
