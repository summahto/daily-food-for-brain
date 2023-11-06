package com.graphs.bfs;

import java.util.*;

public class WallsAndGates {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE ;
        System.out.println(max);
        int [][] rooms = {
                {max, -1, 0, max},
                {max, max, max, -1},
                {max, -1, 0, -1},
                {0, -1, max, max}
        };

        int m = rooms.length, n = rooms[0].length;

        Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
        boolean [] [] visited = new boolean[m][n];

        for(int i =0 ; i< m; i++){
            for(int j = 0; j< n; j++){

                if(rooms[i][j] == 0){
                    q.add(new AbstractMap.SimpleEntry<>(i, j));
                }
            }
        }


        bfs(rooms, m, n, q, visited, max);

        for(int [] a : rooms){
            System.out.println(Arrays.toString(a));
        }

    }

    private static void bfs(int[][] rooms, int m, int n, Queue<Map.Entry<Integer, Integer>> q, boolean[][] visited, int max) {

        int dist = 0;
        while(!q.isEmpty()) {

            System.out.println("queue" + q);

            int size = q.size();
            dist++;
            for(int k=0; k< size; k++){
                Map.Entry<Integer, Integer> e = q.poll();
                int i = e.getKey();
                int j = e.getValue();

                visited[i][j] = true;

                if(i+1 <m && rooms[i+1][j] == max && !visited[i+1][j]){
                    q.add(new AbstractMap.SimpleEntry<>(i+1, j));
                    rooms[i+1][j] = dist;
                }

                if(j+1 <n && rooms[i][j+1] == max && !visited[i][j+1]){
                    q.add(new AbstractMap.SimpleEntry<>(i, j+1));
                    rooms[i][j+1] = dist;
                }

                if(i-1 >= 0 && rooms[i-1][j] == max && !visited[i-1][j]){
                    q.add(new AbstractMap.SimpleEntry<>(i-1, j));
                    rooms[i-1][j] = dist;
                }

                if(j-1 >= 0 && rooms[i][j-1] == max && !visited[i][j-1]){
                    q.add(new AbstractMap.SimpleEntry<>(i, j-1));
                    rooms[i][j-1] = dist;
                }

            }
        }
    }


}
