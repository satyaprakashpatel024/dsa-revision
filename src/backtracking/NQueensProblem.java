package backtracking;
import static helper.Main.*;
public class NQueensProblem {
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        nQueensOneSolution(board,0);
        printMatrix(board);
        System.out.println(count);
    }

    private static boolean isSafe(char[][]board,int row,int col){
        // column check
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonally left up
        for(int j=col-1,i=row-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonally right up
        for(int i=row-1,j=col+1; j<board.length && i>=0; i--,j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    private static void nQueens(char[][] board, int row) {
        if(row==board.length){
            printMatrix(board);
            count++;
            System.out.println("--------");
            return;
        }
        for(int i=0; i< board.length; i++) {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nQueens(board,row+1);
                board[row][i]='.';
            }
        }
    }
    private static boolean nQueensOneSolution(char[][] board, int row) {
        if(row==board.length){
            count++;
            return true;
        }
        for(int i=0; i< board.length; i++) {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                if(nQueensOneSolution(board,row+1))
                    return true;
                board[row][i]='.';
            }
        }
        return false;
    }
}
