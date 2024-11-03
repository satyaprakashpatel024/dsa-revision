package backtracking;

public class SudoSolver {
    public static void main(String[] args) {
        int board[][] = {
                            { 5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0 },
                            { 6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 , 0 },
                            { 0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0 },
                            { 8 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 3 },
                            { 4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1 },
                            { 7 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 6 },
                            { 0 , 6 , 0 , 0 , 0 , 0 , 2 , 8 , 0 },
                            { 0 , 0 , 0 , 4 , 1 , 9 , 0 , 0 , 5 },
                            { 0 , 0 , 0 , 0 , 8 , 0 , 0 , 7 , 9 }
        };
        boolean ans = solveSudoku(board,0,0);
        if(ans){
            System.out.println("Sudoku Solution found");
        }else{
            System.out.println("No Solution found");
        }
    }

    public static boolean solveSudoku(int [][]board,int row,int col) {
        // base case
        if(row == 9 && col==0){
            printSuduko(board);
            return true;
        }
        if(row == 9) return false;
        // check row and column so that they lie's with in range
        int nextRow = row,nextCol = col+1;
        if(nextCol==9){
            nextRow = row+1;
            nextCol = 0;
        }
        // is there is already digit exists move to next empty space
        if(board[row][col]!=0){
            return solveSudoku(board,nextRow,nextCol);
        }
        // new element
        for(int digit=1; digit<=9; digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(solveSudoku(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }

    private static void printSuduko(int[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafe(int[][] board, int row, int col, int digit) {
        // column check
        for(int i=0; i< board.length; i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        // row check
        for(int j=0; j< board.length; j++){
            if(board[row][j]==digit){
                return false;
            }
        }
        // finding the mini grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        // 3X3 mini grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

}
