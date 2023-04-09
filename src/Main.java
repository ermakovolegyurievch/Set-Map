import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        String str ="Публичный, общедоступный класс или член класса. Поля и методы, объявленные с модификатором методы public, видны другим классам из методы текущего пакета и из внешних пакетов.";
        sortArrayListOfOdd(nums);
        sortArrayListOfEvenIncreasePositive(nums);
        sortStingForEvenWords(str);
        countAllRepeatWords(str);
    }

    public static void sortArrayListOfOdd(List<Integer> nums) {
        System.out.println("Задача №1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void sortArrayListOfEvenIncreasePositive(List<Integer> nums) {
        System.out.println("Задача №2");
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                unique.add(num);
            }
        }
        List<Integer> sortedEvens = new ArrayList<>(unique);
        Collections.sort(sortedEvens);
        for (int even : sortedEvens) {
            System.out.println(even);
    }
    }
    public static void sortStingForEvenWords(String str){
        System.out.println("Задача №3");
        String[] words = str.split("[^A-Za-zА-Яа-я]+");
        Set<String> uWords = new HashSet<>();
        Collections.addAll(uWords, words);
        for (String uniqueWord : uWords) {
            System.out.println(uniqueWord+" ");
        }
    }
    public static void countAllRepeatWords(String str) {
        System.out.println("Задача №4");
        String[] words = str.split("[^A-Za-zА-Яа-я]+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!wordCount.containsKey(word)){
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            if (count > 1) {
                System.out.println(word + ": " + count);
            }
        }
    }
}