package mamun;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min = 0;
        // Creating array of grade values
        int[] grades = new int[]{
            82, 70, 99, 90, 92, 75, 87, 85, 91, 100, 91, 87
        };
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (min > grades[i]) {
                min = grades[i];
            }
            if (max < grades[i]) {
                max = grades[i];
            }
        }
        double average = (double) sum / grades.length;
        System.out.printf("    min:  " + min);
        System.out.printf("%n    max:  " + max);
        System.out.printf("%naverage:  %.1f", average);
    }

}
