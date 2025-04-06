import java.util.Scanner;
public class IPValidator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an IP address: ");
            String ip = scanner.nextLine();


            String[] parts = ip.split("\\.");


            if (parts.length == 4) {
                boolean isValid = true;


                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);

                        if (num < 0 || num > 255) {
                            isValid = false;
                            break;
                        }

                        if (part.startsWith("0") && part.length() > 1) {
                            isValid = false;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    System.out.println(ip + " - Valid IP");
                } else {
                    System.out.println(ip + " - Invalid IP");
                }
            } else {
                System.out.println(ip + " - Invalid IP");
            }

            scanner.close();
        }
    }
