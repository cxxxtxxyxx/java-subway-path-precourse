package subway.view;

public class InputView {

    private static final String MAIN_VIEW = "## 메인 화면";
    private static final String SEARCH_ROUTE = "1. 경로 조회";
    private static final String QUIT = "Q. 종료";

    private static final String CRITERIA_LIST = "## 경로 기준";
    private static final String SHORT_DISTANCE = "1. 최단 거리";
    private static final String SHORT_TIME = "2. 최소 시간";
    public static final String BACK = "B. 돌아가기";
    public static final String INPUT_START_STATION = "## 출발역을 입력하세요.";
    public static final String INPUT_END_STATION = "## 도착역을 입력하세요.";
    public static final String CHOOSE_COMMAND = "## 원하는 기능을 선택하세요.";

    public static void mainView() {
        System.out.println(MAIN_VIEW);
        System.out.println(SEARCH_ROUTE);
        System.out.println(QUIT);
    }

    public static void selectCriteria() {
        System.out.println(CRITERIA_LIST);
        System.out.println(SHORT_DISTANCE);
        System.out.println(SHORT_TIME);
        System.out.println(BACK);
    }

    public static void inputStartStation() {
        System.out.println(INPUT_START_STATION);
    }

    public static void inputEndStation() {
        System.out.println(INPUT_END_STATION);
    }

    public static void inputCommand() {
        System.out.println(CHOOSE_COMMAND);
    }
}
