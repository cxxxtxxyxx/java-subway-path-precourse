package subway.domain;

import java.util.List;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class SubwayMap {
    private WeightedMultigraph<Station, DefaultWeightedEdge> subwayMap = new WeightedMultigraph(
            DefaultWeightedEdge.class);
    private DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(subwayMap);


    public List<Station> getStations(Station start, Station end) {
        return dijkstraShortestPath.getPath(start, end).getVertexList();
    }

    public int getShortestPath(Station start, Station end) {
        return (int) dijkstraShortestPath.getPath(start, end).getWeight();
    }

    public void setSubwayMapByDistance() {
        StationRepository.stations().stream()
                .forEach(station -> subwayMap.addVertex(station));

        DistanceBetweenStation.getDistanceBetweenStation().stream()
                .forEach(information -> {
                    subwayMap.setEdgeWeight(
                            subwayMap.addEdge(
                                    StationRepository.getStationByName(information.get(0)),
                                    StationRepository.getStationByName(information.get(1))
                            )
                            , Integer.parseInt(information.get(2)));
                });
    }

    public void setSubwayMapByTime() {
        StationRepository.stations().stream()
                .forEach(station -> subwayMap.addVertex(station));

        TimeBetweenStation.getTimeBetweenStation().stream()
                .forEach(information -> {
                    subwayMap.setEdgeWeight(
                            subwayMap.addEdge(
                                    StationRepository.getStationByName(information.get(0)),
                                    StationRepository.getStationByName(information.get(1))
                            )
                            , Integer.parseInt(information.get(2)));
                });
    }
}
