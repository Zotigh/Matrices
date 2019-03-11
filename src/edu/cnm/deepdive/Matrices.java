package edu.cnm.deepdive;

public class Matrices {


  public static int[][] rotate(int[][] data) {

    int rows = data[0].length;
    int column = data.length; 

    int[][] rotatedMatrices = new int[rows][column];

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[0].length; j++) {
        rotatedMatrices[j][(column - 1) - i] = data[i][j];
      }
    }
    return rotatedMatrices;
  }
}
