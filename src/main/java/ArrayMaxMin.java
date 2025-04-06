import java.util.Random;
import java.util.Arrays;

    public class ArrayMaxMin {
        public static void main(String[] args) {
            Random random = new Random();
            int[] numbers = random.ints(10, 0, 100).toArray();


            System.out.println("Random Numbers: " + Arrays.toString(numbers));


            int max = Arrays.stream(numbers).max().getAsInt();
            int min = Arrays.stream(numbers).min().getAsInt();

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }
