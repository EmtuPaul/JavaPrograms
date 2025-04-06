import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowels: " + output);
        scanner.close();
    }
}
