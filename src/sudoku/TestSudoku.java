package sudoku;

import junit.framework.TestCase;

public class TestSudoku extends TestCase {
	private Sudoku sudoku;
	
	public void escenario() {
		sudoku = new Sudoku();
	}
	
	public void testresolverSudoku(){
        escenario();
		assertTrue(sudoku.resolverSudoku());
    }
}
