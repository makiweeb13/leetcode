class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        int[] countNeighbor = new int[n];
        int smallest, counter = 0, city = 0;

        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[i].length; j++) {
                dist[i][j] = 999999; // infinity
            }
        }

        // graph setup
        for (int i = 0; i < edges.length; i++) {
            dist[edges[i][0]][edges[i][1]] = edges[i][2];
            dist[edges[i][1]][edges[i][0]] = edges[i][2];
        }

        // Floyd-Warshall's algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        dist[i][j] = 0;
                    }
                    else if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // count reachable cities
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[i].length; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    counter++;
                }
            }
            countNeighbor[i] = counter;
            counter = 0;
        }
        
        // find smallest
        smallest = countNeighbor[0];
        for (int i = 0; i < countNeighbor.length; i++) {
            if (countNeighbor[i] <= smallest) {
                smallest = countNeighbor[i];
                city = i;
            }
        }

        return city;
    }
}