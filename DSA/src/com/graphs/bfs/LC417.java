package com.graphs.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC417 {

    public static void main(String[] args) {
        int[][] heights = new int[][] { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 },
                { 5, 1, 1, 2, 4 } };
        System.out.println(pacificAtlantic(heights));

    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {

        if (heights.length == 0)
            return null;

        List<List<Integer>> result = new ArrayList<>();

        if (heights.length == 1) {
            result.add(new ArrayList<>(Arrays.asList(0, 0)));
            return result;
        }

        boolean[] ans = new boolean[2];
        // Set : TODO - do we need it : Yes we do to avoid stackoverflow when coming
        // back to the same visited node
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < heights.length; i++) {

            for (int j = 0; j < heights[i].length; j++) {

                dfs(heights, i, j, i, j, result, ans, visited);
                visited.clear();
                ans[0] = false;
                ans[1] = false;

            }
        }

        return result;
    }

    public static void dfs(int[][] heights, int i, int j, int oi, int oj, List<List<Integer>> result, boolean[] ans,
            Set<String> visited) {

        System.out.println(visited.toString());

        if (i == 0 || j == 0)
            ans[0] = true;

        if (i == heights.length - 1 || j == heights[i].length - 1)
            ans[1] = true;

        if (ans[0] == true && ans[1] == true) {
            result.add(new ArrayList<>(Arrays.asList(oi, oj)));
            return;
        }

        visited.add(i + ":" + j);

        if ((j + 1) < heights[i].length && heights[i][j] >= heights[i][j + 1] && !visited.contains(i + ":" + (j + 1)))
            dfs(heights, i, j + 1, oi, oj, result, ans, visited);

        if ((i + 1) < heights.length && heights[i][j] >= heights[i + 1][j] && !visited.contains((i + 1) + ":" + j))
            dfs(heights, i + 1, j, oi, oj, result, ans, visited);

        if ((i - 1) >= 0 && heights[i][j] >= heights[i - 1][j] && !visited.contains((i - 1) + ":" + j))
            dfs(heights, i - 1, j, oi, oj, result, ans, visited);

        if ((j - 1) >= 0 && heights[i][j] >= heights[i][j - 1] && !visited.contains(i + ":" + (j - 1)))
            dfs(heights, i, j - 1, oi, oj, result, ans, visited);

    }

}
