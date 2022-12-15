package subway.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class DistanceBetweenStation {
    private static final ArrayList<ArrayList<String>> distanceBetweenStation = new ArrayList<ArrayList<String>>(
            Arrays.asList(
                    new ArrayList<String>(Arrays.asList("교대역", "강남역", "2")),
                    new ArrayList<String>(Arrays.asList("강남역", "역삼역", "2")),
                    new ArrayList<String>(Arrays.asList("교대역", "남부터미널역", "3")),
                    new ArrayList<String>(Arrays.asList("남부터미널역", "양재역", "6")),
                    new ArrayList<String>(Arrays.asList("양재역", "매봉역", "1")),
                    new ArrayList<String>(Arrays.asList("강남역", "양재역", "2")),
                    new ArrayList<String>(Arrays.asList("양재역", "양재시민의숲역", "10"))

            )
    );

    public static ArrayList<ArrayList<String>> getDistanceBetweenStation() {
        return distanceBetweenStation;
    }
}
