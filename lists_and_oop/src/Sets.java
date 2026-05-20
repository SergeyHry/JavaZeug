import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sets {


    public static void main(String[] args) {
        ArrayList <Integer>zahlen = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,4,5,6,7,8));
        HashSet<Integer> set = new HashSet<>(zahlen); //Hash erlaubt keine Duplicate (LinkedHashSet - behält Reiehnfolge)
        set.add(-2);
        set.add(0);
        set.add(-1);
        Stream<Integer> strm = set.stream(); //Stream Schnelle operationen an Listen
                        strm.filter(x-> x>=0)
                                .sorted()
                        .limit(5)
                        .forEach(System.out::println);
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Sergey", "Sascha", "Vadim", "Uter", "Michael"));
        List<String> st = str.stream()
        .filter(x->!x.startsWith("S"))
        .map(String::toUpperCase)
                .toList();
        System.out.println(st);
        System.out.println(str);
    }
}


//Hashmap- schnell über einen Schlüssel was finden emails.put("s", "s@test.de") Schlüssel sind eindeutig
//LinkedHashMap reiehnfolge wird behalten
// TreeMap Die Sortierung passiert nach dem Key, nicht nach dem Value.
