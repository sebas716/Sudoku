package sudoku;

public class Principal {
	
	public static void main(String[] args)
    {
        //Matriz inicial de 9x9, tablero a resolver
        int[][] tablero ={
        		{0,0,0,3,9,0,0,7,2},
        		{0,0,0,0,0,0,0,9,5},
        		{0,7,0,0,0,5,3,0,0},
        		{0,0,0,0,0,0,0,0,0},
        		{0,0,0,1,0,0,2,0,0},
        		{0,0,7,0,4,8,0,1,0},
        		{0,6,9,0,0,0,0,5,0},
        		{0,3,0,0,0,9,8,0,0},
        		{5,0,8,7,0,0,0,4,0},
        		};
        Sudoku miSudoku = new Sudoku(tablero);
        miSudoku.resolverSudoku();
        miSudoku.imprimirSudoku();
    }

}