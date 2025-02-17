package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Andrew Huang
 * @author OrelionB
 */


public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet,0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet,0));
        int[] rowSums = allRowSums(spreadsheet);
        for(int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * @param a 2D array
     * @return the maximum value in the 2d parameter array a
     */
    public static int max(int[][] a) {
        int maxValue = Integer.MIN_VALUE;
        for(int row = 0; row < a.length; row++) {
            for(int col = 0; col < a[row].length; col++) {
                if(a[row][col] > maxValue) {
                    maxValue = a[row][col];
                }
            }

        }
        return maxValue;
    }

    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
       int sum = 0;
       for(int row = 0; row < a[x].length; row++) {
           sum += a[x][row];
       }
        return sum;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        int colSum = 0;
        for(int col = 0; col < a.length; col++) {
            if(a[col].length >= x+1){
                colSum += a[col][x];
            }
        }
        return colSum;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        int[] rowSums = new int[a.length];
        for(int col = 0; col < a.length; col++) {
            rowSums[col] = rowSum(a,  col);
        }
        return rowSums;
    }
}