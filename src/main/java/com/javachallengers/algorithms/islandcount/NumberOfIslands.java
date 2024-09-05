package com.javachallengers.algorithms.islandcount;

public class NumberOfIslands {

  public static int numIslands(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    var islandsCount = 0;

    for (int row = 0; row < grid.length; row++) {
      for (int column = 0; column < grid[row].length; column++) {
        if (grid[row][column] == 1) {
          dfs(grid, row, column);
          islandsCount++;
        }
      }
    }

    return islandsCount;
  }

  private static void dfs(int[][] grid, int row, int column) {
    // Base condition
    boolean isRowInvalid = row < 0 || row >= grid.length;
    if (isRowInvalid) return;

    boolean isColumnInvalid = column < 0 || column >= grid[row].length;
    if (isColumnInvalid) return;

    boolean isWater = grid[row][column] == 0;
    if (isWater) return;

    grid[row][column] = 0;

    dfs(grid, row + 1, column);    // Explore down
    dfs(grid, row - 1, column);    // Explore up
    dfs(grid, row, column + 1);  // Explore right
    dfs(grid, row, column - 1);  // Explore left
  }

}
