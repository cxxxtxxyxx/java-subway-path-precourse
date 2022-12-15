package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubwayMapRepository {

    private static final List<SubwayMap> subwayMaps = new ArrayList<>();

    public static List<SubwayMap> subwayMaps() {
        return Collections.unmodifiableList(subwayMaps);
    }

    public static void addSubwayMap(SubwayMap subwayMap) {
        subwayMaps.add(subwayMap);
    }
}
