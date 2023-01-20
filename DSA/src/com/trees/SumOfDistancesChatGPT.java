package com.trees;

import java.util.*;

public class SumOfDistancesChatGPT {

    public static void main(String[] args) {
        int [] [] edges = {{0,1}, {0,2}, {2,3}, {2,4}, {2,5}};
        int n = 5;

        int [] ans = sumOfDistancesInTree(n, edges);
        System.out.println(Arrays.toString(ans));
    }

        public static int[] sumOfDistancesInTree(int n, int[][] edges) {
            // Build the graph using an adjacency list representation
            List<Integer>[] graph = new List[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                int a = edge[0], b = edge[1];
                graph[a].add(b);
                graph[b].add(a);
            }

            // Initialize an array to store the sum of distances for each node
            int[] distances = new int[n];

            // Perform a BFS to compute the sum of distances for each node
            for (int i = 0; i < n; i++) {
                // Initialize a queue to perform a BFS
                Queue<Integer> queue = new LinkedList<>();
                boolean[] visited = new boolean[n];
                queue.offer(i);
                visited[i] = true;

                // Perform the BFS
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int neighbor : graph[node]) {
                        if (!visited[neighbor]) {
                            queue.offer(neighbor);
                            visited[neighbor] = true;
                            distances[i] += 1;
                        }
                    }
                }
            }

            return distances;
        }

}
