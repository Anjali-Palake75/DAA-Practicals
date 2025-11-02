import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class RoadNetworkMST {

    // ----------- PRIM'S ALGORITHM -----------
    static void primMST(int[][] graph, int V) {
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];
        int[] parent = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet, V);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        System.out.println("Prim's MST (Road Network):");
        int totalCost = 0;
        for (int i = 1; i < V; i++) {
            System.out.println("City " + parent[i] + " - City " + i + " : Cost " + graph[i][parent[i]]);
            totalCost += graph[i][parent[i]];
        }
        System.out.println("Total Minimum Cost = " + totalCost + "\n");
    }

    static int minKey(int[] key, boolean[] mstSet, int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++)
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        return minIndex;
    }

    // ----------- KRUSKAL'S ALGORITHM -----------
    static int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return find(parent, parent[i]);
    }

    static void union(int[] parent, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);
        parent[xRoot] = yRoot;
    }

    static void kruskalMST(int[][] graph, int V) {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < V; i++)
            for (int j = i + 1; j < V; j++)
                if (graph[i][j] != 0)
                    edges.add(new Edge(i, j, graph[i][j]));

        Collections.sort(edges);
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        System.out.println("Kruskal's MST (Road Network):");
        int totalCost = 0, count = 0;
        for (Edge e : edges) {
            int root1 = find(parent, e.src);
            int root2 = find(parent, e.dest);
            if (root1 != root2) {
                System.out.println("City " + e.src + " - City " + e.dest + " : Cost " + e.weight);
                totalCost += e.weight;
                union(parent, root1, root2);
                count++;
                if (count == V - 1) break;
            }
        }
        System.out.println("Total Minimum Cost = " + totalCost + "\n");
    }

    // ----------- MAIN FUNCTION -----------
    public static void main(String[] args) {
        // Example: Cost between 5 cities
        int V = 5;
        int[][] cost = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primMST(cost, V);
        kruskalMST(cost, V);
    }
}
