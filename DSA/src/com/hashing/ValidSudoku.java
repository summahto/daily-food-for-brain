package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSudoku {

    public static void main(String[] args) {

        char [] [] board = { {'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','9','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isSudokuValid(board));

    }

    private static boolean isSudokuValid(char[][] board) {

        Map<Character, List<Integer>> countMap = new HashMap<>();

        for(int i=0 ; i< board.length ; i++){

            for (int j = 0; j< board[i].length ; j++){

                if(board[i][j] != '.'){
                    if(!countMap.containsKey(board[i][j])){
                        List<Integer> listOfRowsAndCols = new ArrayList<>();
                        listOfRowsAndCols.add(i);
                        listOfRowsAndCols.add(j);
                        countMap.put(board[i][j], listOfRowsAndCols);
                    } else {
                        if(checkRowCol(countMap.get(board[i][j]), i, j)){
                            System.out.println("found " + board[i][j] + " at row " + i + " and column " + j);
                            return false;

                        } else {
                            countMap.get(board[i][j]).add(i);
                            countMap.get(board[i][j]).add(j);

                        }


                    }


                }
            }

            System.out.println(countMap);
        }

        return true;

    }

    private static boolean checkRowCol(List<Integer> rowColValues, int i, int j) {
        int k=0;
        while ( k < rowColValues.size()){
            if(k %2 == 0){
                if(rowColValues.get(k) == i )
                    return true;

            } else {
                if(rowColValues.get(k) == j )
                    return true;
            }

            k++;
        }

        return false;
    }
}
