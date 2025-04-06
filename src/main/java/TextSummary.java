

       import java.util.Scanner;
        public class TextSummary {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                String[] words = input.trim().split("\\s+");
                int wordCount = words.length;

                String noSpaces = input.replace(" ", "");
                int charCount = noSpaces.length();

                int vowelCount = 0;
                int consonantCount = 0;

                for (int i = 0; i < noSpaces.length(); i++) {
                    char ch = Character.toLowerCase(noSpaces.charAt(i));
                    if (Character.isLetter(ch)) {
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }


                System.out.println("Words: " + wordCount);
                System.out.println("Chars: " + charCount);
                System.out.println("Vowel: " + vowelCount);
                System.out.println("Consonant: " + consonantCount);


                scanner.close();
            }
        }


