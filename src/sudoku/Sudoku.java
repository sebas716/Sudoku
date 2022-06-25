/*Autores: 
JHAJAIRA ANDREA MERCADO ARTEAGA - COD: 100269201
JUAN SEBASTIAN TREJOS MURILLO - COD: 100250374
*/
package sudoku;

public class Sudoku 
{
    private int[][] tablero;
    //Definicion casilla sin numero asignado
    private static final int LIBRE = 0;
    
    public Sudoku()
    {
        //Agrega el tablero inicial de 9x9
        tablero = new int[9][9];
    }
    public Sudoku(int Sudoku[][]){
        this.tablero = Sudoku;
    }
    public boolean resolverSudoku(){
        //Recorre las filas de la matriz de 9x9
        for(int fila=0;fila<9;fila++){
            //Recorre las columnas de la matriz de 9x9
            for(int columna=0;columna<9;columna++){
                //verificamos si la casilla esta vacia o si debe ser llenada
                if(tablero[fila][columna]==LIBRE){
                    //metodo para rellenar la casilla con numeros que van del 1-9
                    for(int numero=1;numero<=9;numero++){
                        //numero valido, osea que no esta en ninguna fila ni columna
                        if(esValido(fila, columna, numero)){
                            tablero[fila][columna] = numero;
                            if(resolverSudoku()){
                                //cuando lo encontramos retorna un verdadero
                                return true;
                            } else {
                                tablero[fila][columna] = LIBRE;
                            }
                        }
                        //retorna falso, si nunca encuentra un numero valido
                    } return false;
                }
            }
        } return true;
    }
    //Comprubea las filas
    private boolean contieneEnFila(int fila, int numero){
        for(int i=0;i<9;i++){
            if(tablero[fila][i]==numero){
                return true;
            }
        } return false;
    }
    //Comprueba las columnas
    private boolean contieneEnColumna(int columna, int numero){
        for(int i=0;i<9;i++){
            if(tablero[i][columna]==numero){
                return true;
            }
        } return false;
    }
    //Comprueba cada casilla son 9 casillas de 3x3 cada una
    private boolean contieneEnCasilla(int fila, int columna, int numero){
        int f = fila - fila%3;
        int c = columna - columna%3;
        for (int i = f ; i< f+3 ; i++){
            for(int j = c; j < c+3 ; j++){
                if (tablero[i][j]==numero){
                    return true;
                }
            }
        } return false;
    }
   //Comprueba que el numero sea valida, no se encuentre repetido en fila, columna, ni casilla
    private boolean esValido(int fila, int columna, int numero){
        //Retorna falso al tener una negacion antes (!)
        return !(contieneEnFila(fila, numero)||contieneEnColumna(columna, numero)||contieneEnCasilla(fila, columna, numero));
    }
    //Imprime el tablero del Sudoku Resuelto
    public void imprimirSudoku(){
    	System.out.println("_________________________________");
    	System.out.println("\n      Solucion del Sudoku       ");
    	System.out.println("_________________________________");
        for(int i=0;i<9;i++){
            if (i%3==0 && i!=0){
            System.out.println("---------------------------------");
        } for(int j=0;j<9;j++){
            if(j%3==0 && j!=0){
                System.out.print(" | ");
            }
            System.out.print(" " + tablero[i][j] + " ");
        }
        System.out.println();
        }
        System.out.println("_________________________________");
    }
}
