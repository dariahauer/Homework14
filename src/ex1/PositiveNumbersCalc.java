package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumbersCalc {
    public static void main(String[] args) {
        List<Integer> intList = createList();
        reverse(intList);
        System.out.println("Original list: " + intList);
        sumAndDisplay(intList);
        System.out.printf("Minimum and maximum value in List: %d and %d", getMin(intList), getMax(intList));
    }

    private static List<Integer> createList() {
        List<Integer> intList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int userInt = 0;

        do {
            System.out.println("Enter number: ");
            userInt = scan.nextInt();
            scan.nextLine();
            if (userInt >= 0) {
                intList.add(userInt);
            }
        } while (userInt >= 0);
        scan.close();
        return intList;
    }


    static void reverse(List<Integer> original) {
        for (int i = original.size() - 1; i >= 0; i--) {
            original.get(i);
            System.out.println("Reverse list: " + original.get(i));
        }
    }


    static void sumAndDisplay(List<Integer> original) {
        int sum = 0;
        String text = "";
        StringBuilder strB = new StringBuilder(text);

        for (int i = 0; i < original.size(); i++) {
            sum += original.get(i);
            strB.append(original.get(i).toString());
            strB.append("+");
        }
        strB.deleteCharAt(strB.length() - 1);
        text = strB.toString();

        System.out.println("Suma elementów " + text + " =" + sum);
    }


    static int getMax(List<Integer> original) {
        int maxValue = original.get(0);
        for (int i = 0; i < original.size(); i++) {
            if (maxValue < original.get(i)) {
                maxValue = original.get(i);
            }

        }
        return maxValue;

    }

    static int getMin(List<Integer> original) {
        int minValue = original.get(0);
        for (int i = 0; i < original.size(); i++) {
            if (minValue > original.get(i)) {
                minValue = original.get(i);
            }
        }
        return minValue;

    }

}

