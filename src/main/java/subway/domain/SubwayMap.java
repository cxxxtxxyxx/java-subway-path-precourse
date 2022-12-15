package subway.domain;

import static subway.domain.StationRepository.getStationByName;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class SubwayMap {
    private WeightedMultigraph<Station, DefaultWeightedEdge> subwayMap = new WeightedMultigraph(
            DefaultWeightedEdge.class);

    public int getShortestPath(Station start, Station end) {
        DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(subwayMap);
        return (int)dijkstraShortestPath.getPath(start, end).getWeight();
    }

    public void setSubwayMapByDistance() {
        StationRepository.stations().stream()
                .forEach(station -> subwayMap.addVertex(station));

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("교대역"),
                        StationRepository.getStationByName("강남역")
                )
                ,2);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("강남역"),
                        StationRepository.getStationByName("역삼역")
                )
                ,2);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("교대역"),
                        StationRepository.getStationByName("남부터미널역")
                )
                ,3);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("남부터미널역"),
                        StationRepository.getStationByName("양재역")
                )
                ,6);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("양재역"),
                        StationRepository.getStationByName("매봉역")
                )
                ,1);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("강남역"),
                        StationRepository.getStationByName("양재역")
                )
                ,2);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("양재역"),
                        StationRepository.getStationByName("양재시민의숲역")
                )
                ,10);
    }

    public void setSubwayMapByTime() {
        StationRepository.stations().stream()
                .forEach(station -> subwayMap.addVertex(station));

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("교대역"),
                        StationRepository.getStationByName("강남역")
                )
                ,3);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("강남역"),
                        StationRepository.getStationByName("역삼역")
                )
                ,3);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("교대역"),
                        StationRepository.getStationByName("남부터미널역")
                )
                ,2);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("남부터미널역"),
                        StationRepository.getStationByName("양재역")
                )
                ,5);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("양재역"),
                        StationRepository.getStationByName("매봉역")
                )
                ,1);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("강남역"),
                        StationRepository.getStationByName("양재역")
                )
                ,8);

        subwayMap.setEdgeWeight(
                subwayMap.addEdge(
                        StationRepository.getStationByName("양재역"),
                        StationRepository.getStationByName("양재시민의숲역")
                )
                ,3);
    }
}
