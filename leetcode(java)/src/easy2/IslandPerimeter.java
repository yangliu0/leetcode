package easy2;

/**
 * 463. Island Perimeter
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 */
public class IslandPerimeter
{
    public int islandPerimeter(int[][] grid)
    {
        int rows = grid.length;
        int cols = grid[0].length;
        int landnum = 0, neighbornum = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(grid[i][j] == 1)
                {
                    landnum++;
                    if((i < rows - 1) && grid[i + 1][j] == 1)
                    {
                        neighbornum++;
                    }
                    if((j < cols - 1) && grid[i][j + 1] == 1)
                    {
                        neighbornum++;
                    }
                }
            }
        }

        return landnum * 4 - neighbornum * 2;
    }

    public static void main(String[] args)
    {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(new IslandPerimeter().islandPerimeter(grid));
    }
}
