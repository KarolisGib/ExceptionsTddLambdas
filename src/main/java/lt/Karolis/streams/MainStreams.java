package lt.Karolis.streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MainStreams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a9", "a2", "b9", "b3", "b5", "b6", "bc8", "ba7");
        List<String> modList;

        System.out.println(list);

        modList = list.stream().
                filter(var -> var.contains("a"))
                .map(var -> var + "_" + UUID.randomUUID())
                .toList();

        System.out.println(modList);

        list.stream().
                filter(var -> var.contains("a"))
                .map(var -> var + "_" + LocalTime.now().getNano())
                .forEach(System.out::println);
    }
}
