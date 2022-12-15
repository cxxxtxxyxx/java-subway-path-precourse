package subway;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import subway.constants.Command;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.SubwayMap;
import subway.view.InputView;
import subway.view.OutputView;

public class Application {
    public static SubwayMap subwayMapByDistance;
    public static SubwayMap subwayMapByTime;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        setInformation();
        programInitiation(scanner);

    }

    public static void setInformation() {
        setStations();
        setLines();
        subwayMapByDistance = new SubwayMap();
        subwayMapByDistance.setSubwayMapByDistance();
        subwayMapByTime = new SubwayMap();
        subwayMapByTime.setSubwayMapByTime();
    }

    private static void setStations() {
        Station gyodae = new Station("교대역");
        Station gangnam = new Station("강남역");
        Station yeoksam = new Station("역삼역");
        Station nambooterminal = new Station("남부터미널역");
        Station yangjae = new Station("양재역");
        Station maebong = new Station("매봉역");
        Station yangjaesimin = new Station("양재시민의숲역");

        Station.getStationNames().stream()
                .map(Station::new)
                .forEach(StationRepository::addStation);
    }

    private static void setLines() {
        Station gyodae = new Station("교대역");
        Station gangnam = new Station("강남역");
        Station yeoksam = new Station("역삼역");
        Station nambooterminal = new Station("남부터미널역");
        Station yangjae = new Station("양재역");
        Station maebong = new Station("매봉역");
        Station yangjaesimin = new Station("양재시민의숲역");

        ArrayList<Line> lines = new ArrayList<Line>(
                Arrays.asList(
                        new Line("2호선", new ArrayList<Station>(Arrays.asList(gyodae, gangnam, yeoksam))),
                        new Line("3호선",
                                new ArrayList<Station>(Arrays.asList(gyodae, nambooterminal, yangjae, maebong))),
                        new Line("신분당선", new ArrayList<Station>(Arrays.asList(gangnam, yangjae, yangjaesimin)))
                )
        );

        lines.stream()
                .forEach(LineRepository::addLine);
    }

    private static void programInitiation(Scanner scanner) {
        while (true) {
            if (Command.isQuit(getOperationCommand(scanner))) {
                break;
            }
            String criteria = getCriteria(scanner);
            if (Command.isBack(criteria)) {
                continue;
            }

            getResult(scanner, criteria);

        }
    }

    private static String getOperationCommand(Scanner scanner) {
        InputView.mainView();
        InputView.inputCommand();

        String command = scanner.nextLine();
        return command;
    }

    private static String getCriteria(Scanner scanner) {
        InputView.selectCriteria();
        InputView.inputCommand();

        String criteria = scanner.nextLine();
        return criteria;
    }

    private static void getResult(Scanner scanner, String criteria) {
        InputView.inputStartStation();
        String startStationName = scanner.nextLine();

        InputView.inputEndStation();
        String endStationName = scanner.nextLine();

        OutputView.printResult(startStationName, endStationName, criteria);
    }




}
