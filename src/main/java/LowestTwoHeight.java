import java.util.Scanner;
public class LowestTwoHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];


        System.out.println("Enter heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }


        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < min1) {
                min2 = min1;
                min1 = heights[i];
            } else if (heights[i] < min2 && heights[i] != min1) {
                min2 = heights[i];
            }
        }

        System.out.println("\nThe two lowest heights are: " + min1 + " cm and " + min2 + " cm");

        scanner.close();
    }
}



