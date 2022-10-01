import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([0-1][0-9])|([2][0-3]):[0-5][0-9]");
        Matcher matcher = pattern.matcher("Мне на работу в 23:50");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}