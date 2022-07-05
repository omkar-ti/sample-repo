import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(^(?!(addCommitToCommitIndex)))(^(?!(get)|(set)).*)((^[A-Za-z0-9._]+$)|(^lambda\\$.*$))");
        System.out.println(pattern.matcher("hi").find());
        System.out.println("Hello world!");
    }
}
