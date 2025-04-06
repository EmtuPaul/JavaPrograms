import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CGPA to search: ");
        double target = scanner.nextDouble();

        int index = Arrays.binarySearch(cgpa, target);

        if (index >= 0) {
            System.out.println("CGPA " + target + " is present in the list at index " + index + ".");
        } else {
            System.out.println("CGPA " + target + " is NOT present in the list.");
        }
        scanner.close();
    }
}
