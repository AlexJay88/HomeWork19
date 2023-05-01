import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);


        List<String> wordList = new ArrayList<>(List.of("apple", "bananas", "potato", "apple", "kivi", "potato"));
        task3(wordList);
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        task4(strings);
    }
    public static void task1(List<Integer> list) {

        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.println(integer);
            }

        }
    }
    public static void task2(List<Integer> list) {
        Set<Integer> getNumbers = new HashSet<>();
        for (Integer integer : list) {
            if (!getNumbers.contains(integer)) {
                if (integer % 2 == 0) {
                    System.out.println(integer);
                    getNumbers.add(integer);
                }

            }
        }
    }
    public static void task3(List<String> wordList) {
        Set<String> uniqueWords = new HashSet<>(wordList);
        System.out.println(uniqueWords);

    }


    public static void task4(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);

            }
        }
        for (String s : map.keySet()) {
            System.out.println("строка " + s + " повторяется " + map.get(s) + " раза");

        }
    }
}