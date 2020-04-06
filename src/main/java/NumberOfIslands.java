public class NumberOfIslands {

/****
 *
 *
 * # Example 1:
 *
 * # Input:
 * # 11110
 * # 11010
 * # 11000
 * # 00000
 *
 * # Output: 1
 *
 *
 * # Example 2:
 *
 * # Input:
 * # 11000
 * # 11000
 * # 00100
 * # 00011
 *
 * # Output: 3
 *
 *
 *
 * @param args
 **/

    public int numberOfIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int num = 0;

        for(int i =0; i < grid.length; i++) {
            for(int j=0; j< grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    num = num + dfs(i, j , grid);
                }

            }
        }

        return num;
    }


    /**
     * //new char[][]{{1,1,1,1,0}, {1,1,0,1,0}, {1,1,0,0,0}, {0,0,0,0,0}}
     * 11110
     * 11010
     * 11000
     * 00000
     */
    private int dfs(int i, int j, char[][] grid) {

        if (i < 0 || i >= grid.length || j < 0 || j>= grid.length || grid[i][j] == 0) return 0;

        grid[i][j] = 0;

        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
        return 1;

    }
}
