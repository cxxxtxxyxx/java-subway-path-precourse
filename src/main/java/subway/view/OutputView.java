package subway.view;

import java.util.List;
import subway.Application;
import subway.constants.Command;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.SubwayMap;

public class OutputView {
    public static final String BLANK = " ";
    private static final String INFO = "[INFO]";
    private static final String LINE_SEPERATOR = "---";
    public static final String SEARCH_RESULT = "## 조회 결과";
    public static final String KILOMETER = "km";
    public static final String MINUTE = "분";
    public static final String TOTAL_DISTANCE = "총 거리: ";
    public static final String TOTAL_TIME = "총 소요 시간: ";
    public static void printResult(String startStationName, String endStationName, String command) {
        Station startStation = StationRepository.getStationByName(startStationName);
        Station endStation = StationRepository.getStationByName(endStationName);

        SubwayMap mainMap = Application.subwayMapByDistance;
        SubwayMap subMap = Application.subwayMapByTime;
        if (Command.isShortTimeAsCriteria(command)) {
            mainMap = Application.subwayMapByTime;
            subMap = Application.subwayMapByDistance;
        }
        List<Station> stations = mainMap.getStations(startStation, endStation);

        int mainWeight = mainMap.getShortestPath(startStation, endStation);
        int subweight = 0;
        for (int i = 0; i < stations.size() - 1; i++) {
            subweight += subMap.getShortestPath(stations.get(i), stations.get(i + 1));
        }

        System.out.println(SEARCH_RESULT);
        System.out.println(INFO + BLANK + LINE_SEPERATOR);

        if (Command.isShortTimeAsCriteria(command)) {
            System.out.println(INFO + BLANK + TOTAL_DISTANCE + subweight + KILOMETER);
            System.out.println(INFO + BLANK + TOTAL_TIME + mainWeight + MINUTE);
            stations.stream()
                    .forEach(station -> System.out.println(INFO + BLANK + station.getName()));
            System.out.println(INFO + BLANK + LINE_SEPERATOR);
            return;
        }
        System.out.println(INFO + BLANK + TOTAL_DISTANCE + mainWeight + KILOMETER);
        System.out.println(INFO + BLANK + TOTAL_TIME + subweight + MINUTE);
        stations.stream()
                .forEach(station -> System.out.println(INFO + BLANK + station.getName()));
        System.out.println(INFO + BLANK + LINE_SEPERATOR);



    }
}
