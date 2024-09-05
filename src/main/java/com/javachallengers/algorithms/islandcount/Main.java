package com.javachallengers.algorithms.islandcount;

public class Main {

  static int[][] grid1 = {};
  static int[][] grid2 = {{1}};

  static int[][] oneIsland = {
          {1, 1, 1, 1, 1},
          {1, 1, 1, 1, 1},
          {1, 1, 1, 1, 1},
          {1, 1, 1, 1, 1}
  };

  static int[][] simpleCase = {
          {1, 1, 0, 0, 0},
          {1, 1, 0, 0, 0},
          {0, 0, 1, 0, 0},
          {0, 0, 0, 1, 1}
  };

  static int[][] complexConfiguration = {
          {1, 1, 0, 0, 0},
          {0, 1, 0, 0, 1},
          {0, 0, 0, 1, 1},
          {1, 0, 1, 1, 0},
          {1, 0, 1, 1, 0}
  };

  static int[][] onlyWater = {
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0}
  };

  static int[][] multipleDisconnectedIslands = {
          {1, 0, 0, 1, 0},
          {0, 0, 0, 0, 0},
          {0, 1, 0, 0, 0},
          {0, 0, 0, 1, 1}
  };

  public static void main(String ... args) {
    var result = NumberOfIslands.numIslands(complexConfiguration);
    System.out.println(result);
  }

}
