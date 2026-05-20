import java.util.Map;
import java.util.TreeMap;

public class Gen <T, U> {
    private Map<T, U> map = new TreeMap<>();

    public void setMap(Map<T, U> map) {
        this.map = map;
    }
    public Map <T, U> getMap(){
        return map;
    }

    public void show() {
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
        }


