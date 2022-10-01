import java.awt.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String surnames = "Sidorov Nesidorov Midorov";

        List<String> result = surnameSearch.surnameSearch(surnames, "M(\\w*)");

        for (String match : result){
            System.out.println(match);
        }

        if(result.isEmpty()){
            System.out.println("Matches not found");
        }

    }
}