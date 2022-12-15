package subway.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Station {
    private static final List<String> STATION_NAMES = Arrays.asList(
            "교대역",
            "강남역",
            "역삼역",
            "남부터미널역",
            "양재역",
            "매봉역",
            "양재시민의숲역"
    );
    public static List<String> getStationNames() {
        return STATION_NAMES;
    }
//    public static final String GYODAE = "교대역";
//    public static final String GANGNAM = "강남역";
//    public static final String YEOKSAM = "역삼역";
//    public static final String NAMBOO_TERMINAL = "남부터미널역";
//    public static final String YANGJAE = "양재역";
//    public static final String MAEBONG = "매봉역";
//    public static final String FOREST_OF_YANGJAE_CITIZEN = "양재시민의숲역";


    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
