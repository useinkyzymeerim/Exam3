package Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "яблоко");
        dictionary.put("banana", "банан");
        dictionary.put("car", "машина");
        dictionary.put("home", "дом");
        dictionary.put("girl", "девочка");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word in English: ");
        String word = scanner.nextLine();

        String translation = findTranslation(dictionary, word);
        if (translation != null) {
            System.out.println("Translation of the word " + word + " In English: " + translation);
        } else {
            System.out.println("Translation for a word " + word + " Not found");
        }
    }

    private static String findTranslation(Map<String, String> dictionary, String word) {
        return dictionary.get(word);
    }
}
