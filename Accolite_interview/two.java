
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import java.util.stream.Collector;
import java.util.stream.Collectors;

class two

{
    public static void main(String args[]) {

        String st = "asj hjhaj wbk jb jh wb j hb whw bh my name is ashish manhas";

        Map<Character, Long> frequency = st.chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(frequency);

        List<Map.Entry<Character, Long>> sortedList = frequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue()
                        .compareTo(entry1.getValue()))
                .toList();

        System.out.println(sortedList);

    }
}