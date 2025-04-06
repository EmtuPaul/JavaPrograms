import java.util.Scanner;
public class NoteBreakDown {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        System.out.println("Note breakdown:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount = amount % notes[i];

                System.out.println(notes[i] + " Tk note: " + count + " piece");
            }
        }

        scanner.close();
    }
}
