
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractTransactionId {
    public static void main(String[] args) {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";


        String regex = "Transaction Id: (TXN\\d+)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            System.out.println("Transaction Id: " + matcher.group(1));
        } else {
            System.out.println("Transaction Id not found.");
        }
    }
}
