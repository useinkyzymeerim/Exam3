package Exercise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string of numbers separated by spaces: ");
        String inputNum1 = scanner.nextLine();
        String[] num1 = inputNum1.split(" ");

        System.out.print("Enter a second string of numbers separated by spaces: ");
        String inputNum2 = scanner.nextLine();
        String[] num2 = inputNum2.split(" ");

        Set<String> numbers = new HashSet<>();
        Set<String> resultSet = new HashSet<>();

        for (String num : num1) {
            numbers.add(num);
        }

        for (String num : num2) {
            if (numbers.contains(num)) {
                resultSet.add(num);
            }
        }

        System.out.println("Numbers that appear in both the first and second lines: " + resultSet);
    }

}
