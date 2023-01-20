package com.graphs.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static class Cell{
        int row;
        int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        int[][] image =  {  {1,1,1},
                            {1,1,0},
                            {1,0,1}  } ;
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        System.out.println("initial image : ");
        System.out.println(Arrays.deepToString(image).replace("], ", "],\n "));

//        int [] [] finalImage = floodFill(image, sr, sc, color);
        floodFillDFS(image, sr, sc, newColor, image[sr][sc], 0);

        System.out.println("\nfinal image : ");
        System.out.println(Arrays.deepToString(image).replace("], ", "],\n "));

    }

    private static void floodFillDFS(int[][] image, int sr, int sc, int newColor, int baseColor, int i) {
        int lr = image.length;
        int lc = image[0].length;

        System.out.println("Iteration Number :" + i);
        System.out.println("--" + sr);
        System.out.println("++" + sc);

        if(sr < 0 || sr >= lr || sc < 0 || sc >= lc || image[sr][sc] != baseColor)
            return;

        image[sr][sc] = newColor;
        floodFillDFS(image, sr+1, sc, newColor, baseColor, ++i);
        floodFillDFS(image, sr-1, sc, newColor, baseColor, ++i);
        floodFillDFS(image, sr, sc+1, newColor, baseColor, ++i);
        floodFillDFS(image, sr, sc-1, newColor, baseColor, ++i);

    }

    private static int [][] floodFill(int[][] image, int sr, int sc, int color) {

        Queue<Cell> queue = new LinkedList<>();
        int startCellColor = image[sr][sc];
        Cell startCell = new Cell(sr, sc);

        if(startCellColor != color) {
            queue.add(startCell);
        }

        while(!queue.isEmpty()){

            int size = queue.size();
            for (int i = 0 ; i< size; i++){

                Cell cell = queue.poll();
                image[cell.row][cell.col] = color;

                if(cell.row -1 >= 0 && image[cell.row-1][cell.col] == startCellColor)
                    queue.add(new Cell(cell.row-1, cell.col));

                if(cell.row +1 < image.length && image[cell.row+1][cell.col] == startCellColor)
                    queue.add(new Cell(cell.row+1, cell.col));

                if(cell.col-1 >= 0 && image[cell.row][cell.col-1] == startCellColor)
                    queue.add(new Cell(cell.row, cell.col-1));

                if(cell.col +1 < image[cell.row].length && image[cell.row][cell.col+1] == startCellColor)
                    queue.add(new Cell(cell.row, cell.col+1));
            }
        }

        return image;

    }
}
