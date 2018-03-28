package com.airport.algo;

import com.airport.model.*;

import java.util.List;

public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
