package sudoku;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args)
    {
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
      //Se imprimen las reglas básicas del Sudoku
        System.out.println("_________________________________");
        System.out.println("""
                           **REGLAS** 
                           El numero 0 equivale a las casillas 
                           vacias, se debe reemplazar por numeros 
                           del 1 al 9, estos no deben repetirse 
                           en cada fila, columna o casilla.""");
        //Se imprime el Sudoku inicial, que se plantea para resolver
        System.out.println("_________________________________");
        System.out.println("\n   Intente resolver el Sudoku       ");
        System.out.println("_________________________________");
        //Impresión del tablero inicial o matriz
        for (int i=0;i<tablero.length;i++) {
            if (i%3==0 && i!=0){
            System.out.println("---------------------------------");
            }
            for (int j=0;j<tablero[i].length;j++) {
                if(j%3==0 && j!=0){
                System.out.print(" | ");
            }
                System.out.print(" "+tablero[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("_________________________________");

        Sudoku miSudoku = new Sudoku(tablero);
        
        @SuppressWarnings("resource")
		Scanner continuar = new Scanner(System.in);
        //Metodo Para pausar la ejecución del programa
        @SuppressWarnings("unused")
		int tecla;
        //Se imprime mensaje en pantalla para continuar
        System.out.println("\n Presione **ENTER** para resolver el Sudoku...\n");
        //Continuamos con la ejecución del codigo
        continuar.nextLine();
        
        miSudoku.resolverSudoku();
        miSudoku.imprimirSudoku();
    }
}