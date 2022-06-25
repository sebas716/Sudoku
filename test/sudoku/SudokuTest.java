
package sudoku;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SudokuTest {
    
    public SudokuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of resolverSudoku method, of class Sudoku.
     */
    @Test
    public void testResolverSudoku() {
        System.out.println("resolverSudoku");
        Sudoku instance = new Sudoku();
        boolean expResult = false;
        boolean result = instance.resolverSudoku();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirSudoku method, of class Sudoku.
     */
    @Test
    public void testImprimirSudoku() {
        System.out.println("imprimirSudoku");
        Sudoku instance = new Sudoku();
        instance.imprimirSudoku();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
