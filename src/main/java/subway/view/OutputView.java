package subway.view;

import java.util.List;
import subway.Application;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.SubwayMap;

public class OutputView {
    private static final String INFO = "[INFO]";
    private static final String LINE_SEPERATOR = "---";

    public static void printResult(String startStationName, String endStationName, String command) {
        Station startStation = StationRepository.getStationByName(startStationName);
        Station endStation = StationRepository.getStationByName(endStationName);

        SubwayMap mainMap = Application.subwayMapByDistance;
        SubwayMap subMap = Application.subwayMapByTime;
        if (command.equals("2")) {
            mainMap = Application.subwayMapByTime;
            subMap = Application.subwayMapByDistance;
        }
        List<Station> stations = mainMap.getStations(startStation, endStation);

        int mainWeight = mainMap.getShortestPath(startStation, endStation);
        int subweight = 0;
        for (int i = 0; i < stations.size() - 1; i++) {
            subweight += subMap.getShortestPath(stations.get(i), stations.get(i + 1));
        }

        System.out.println("## 조회 결과");
        System.out.println(INFO + " " + LINE_SEPERATOR);
        if (command.equals("1")) {
            System.out.println(INFO + " " + "총 거리: " + mainWeight + "km");
            System.out.println(INFO + " " + "총 소요 시간: " + subweight + "분");
            stations.stream()
                    .forEach(station -> System.out.println(INFO + " " + station.getName()));
            System.out.println(INFO + " " + LINE_SEPERATOR);
            return;
        }
        System.out.println(INFO + " " + "총 거리: " + subweight + "km");
        System.out.println(INFO + " " + "총 소요 시간: " + mainWeight + "분");
        stations.stream()
                .forEach(station -> System.out.println(INFO + " " + station.getName()));
        System.out.println(INFO + " " + LINE_SEPERATOR);



    }
}
