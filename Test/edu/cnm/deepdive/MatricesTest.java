package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatricesTest {

  private static final int[][] Input1 = {{-1}};
  private static final int[][] Input2 = {{1,2},{4,3}};
  private static final int[][] Input3 = {{2,4,6},{8,10,12},{14,16,18}};
  private static final int[][] Expected1 = {{-1}};
  private static final int[][] Expected2 = {{4,1},{3,2}};
  private static final int[][] Expected3 = {{14,8,2},{16,10,4},{18,12,6}};

  @Test
  void rotate() {

    assertArrayEquals(Expected1, Matrices.rotateClock(Input1));
    assertArrayEquals(Expected2, Matrices.rotateClock(Input2));
    assertArrayEquals(Expected3, Matrices.rotateClock(Input3));
  }
}