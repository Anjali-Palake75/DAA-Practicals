// GPS Navigation System using Dijkstra's Algorithm
// Finds the shortest path from a source location to all other locations

import java.util.*;

class GPSNavigationSystem {
    private int vertices; // number of locations

    GPSNavigationSystem(int v) {
        vertices = v;
    }

    // Function to find the vertex with minimum distance value
    int minDistance(int dist[], boolean visited[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < vertices; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Dijkstra’s Algorithm to find shortest path from source
    void dijkstra(int graph[][], int src, String[] locationNames) {
        int dist[] = new int[vertices];
        boolean visited[] = new boolean[vertices];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(visited, false);
        dist[src] = 0;

        // Main loop
        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print results
        printSolution(dist, src, locationNames);
    }

    void printSolution(int dist[], int src, String[] names) {
        System.out.println("Shortest Routes from " + names[src] + ":\n");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + names[i] + " Distance = " + dist[i] + " km");
        }
    }

    // ---------- MAIN FUNCTION ----------
    public static void main(String[] args) {
        // Graph: adjacency matrix (0 = no direct road)
        int graph[][] = {
            {0, 4, 0, 0, 0, 0, 8},
            {4, 0, 8, 0, 0, 0, 11},
            {0, 8, 0, 7, 0, 4, 0},
            {0, 0, 7, 0, 9, 14, 0},
            {0, 0, 0, 9, 0, 10, 0},
            {0, 0, 4, 14, 10, 0, 2},
            {8, 11, 0, 0, 0, 2, 0}
        };

        String[] locations = {
            "Home", "School", "Mall", "Hospital", "Park", "Station", "Airport"
        };

        GPSNavigationSystem gps = new GPSNavigationSystem(7);
        gps.dijkstra(graph, 0, locations); // source = Home (vertex 0)
    }
}
