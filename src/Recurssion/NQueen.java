package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        solveNQueens(4);
    }
    public static List<List<String>> solveNQueens(int n) {
        // is Safe i need to check
        // recursively operation

        List<List<String>> result= new ArrayList<>();
        char[][] tmp= new char[n][n];
        for (int i=0;i<n;i++){
            Arrays.fill(tmp[i],'.');
        }

        solveNQueenRecurssion(n, result, tmp, 0);
        return result;


    }

    public static void solveNQueenRecurssion(int n,List<List<String>> result, char[][] tmp, int row ){
        if(n==row){
            List<String> solution = new ArrayList<>();
            for(char[] ch: tmp){
                solution.add(new String(ch));
            }
            result.add(solution);
            return;
        }


        for(int col=0; col<n;col++) {
            if (isSafe(tmp, row, col,n)) {
                tmp[row][col] = 'Q';
                solveNQueenRecurssion(n, result, tmp, row + 1);
                tmp[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] tmp, int row, int col, int n){

        for(int i = 0; i < row; i++) {
            if(tmp[i][col] == 'Q') return false;
        }


        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(tmp[i][j] == 'Q') return false;
        }


        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if(tmp[i][j] == 'Q') return false;
        }

        return true;
    }

}
