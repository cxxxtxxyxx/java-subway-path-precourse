package subway.domain;

import java.util.ArrayList;

public class Line {
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
