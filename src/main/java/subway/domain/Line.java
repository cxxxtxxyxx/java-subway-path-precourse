package subway.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    public static final List<String> LINE_NUMBERS = Arrays.asList(
            "2호선",
            "3호선",
            "신분당선"
    );
//    public static final String NUMBER_TWO = "2호선";
//    public static final String NUMBER_THREE = "3호선";
//    public static final String NUMBER_NEW_BUNDANG = "신분당선";
    private String name;
    private ArrayList<Station> stations;

    public Line(String name, ArrayList<Station> stations) {
        this.name = name;
        this.stations = stations;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
