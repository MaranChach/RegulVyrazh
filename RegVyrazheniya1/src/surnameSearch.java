import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class surnameSearch {
    public static List<String> surnameSearch(String searchString, String regex){
        int num = 0;
        ArrayList<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(searchString);

        while (matcher.find()){
            result.add(matcher.group());
            num++;
        }

        return result;
    }
}
