package subway.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static List<String> getAllStationNames() {
        return stations.stream()
                .map(station -> station.getName())
                .collect(Collectors.toList());
    }

    public static Station getStationByName(String name) {
        return stations().stream()
                .filter(station -> station.getName().equals(name))
                .findFirst()
                .get();
    }

    public static void deleteAll() {
        stations.clear();
    }
}
