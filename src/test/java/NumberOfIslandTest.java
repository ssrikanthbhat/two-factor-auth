import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandTest {

    @Test
    public void testNumberOfIslandsWithNull() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        Assertions.assertTrue(numberOfIslands.numberOfIslands(null) == 0);
    }

    /***
     *
     *
     *
     *  /****
     *      *
     *      *
     *      * # Example 1:
     *      *
     *      * # Input:
     *      * # 11110
     *      * # 11010
     *      * # 11000
     *      * # 00000
     *      *
     *      * # Output: 1
     *      *
     *      *
     *      * # Example 2:
     *      *
     *      * # Input:
     *      * # 11000
     *      * # 11000
     *      * # 00100
     *      * # 00011
     *      *
     *      * # Output: 3
     *      *
     *      *
     *      *
     *      * @param args
     *      */
    @Test
    public void testNumberOfIslandsWithValidInput() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = new char[][]{{1,1,1,1,0}, {1,1,0,1,0}, {1,1,0,0,0}, {0,0,0,0,0}};


        Assertions.assertTrue(numberOfIslands.numberOfIslands(grid) == 1);
    }

    @Test
    public void testNumberOfIslandsWithValidInput1() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = new char[][]{{1,1,0,0,0}, {1,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1}};


        Assertions.assertTrue(numberOfIslands.numberOfIslands(grid) == 3);
    }
}
