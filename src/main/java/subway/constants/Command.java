package subway.constants;

public class Command {
    private static final String SEARCH = "1";
    private static final String QUIT = "Q";
    private static final String SHORT_DISTANCE = "1";
    private static final String SHORT_TIME = "2";
    private static final String BACK = "B";

    private Command() {
    }

    public static boolean isShortTimeAsCriteria(String command) {
        return command.equals(SHORT_TIME);
    }
    public static boolean isBack(String command) {
        return command.equals(BACK);
    }

    public static boolean isQuit(String command) {
        return command.equals(QUIT);
    }
}
