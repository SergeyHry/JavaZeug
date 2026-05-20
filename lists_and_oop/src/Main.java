import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Gen m = new Gen();
    Map<String, LocalDate> mm = new TreeMap<>();
    mm.put("Sergey", LocalDate.of(2023, 10, 1));
    mm.put("Michael", LocalDate.of(1981,12,20));
    m.setMap(mm);

    m.show();
        }
    }
