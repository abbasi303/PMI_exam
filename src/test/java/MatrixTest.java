/* Task 1 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;


    @Test
    public void testIndexOfFirstNonZero() {
        int[][] matrix = {
                {  0,   0,   0,   0,   0},
                {  0,   0,   0, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };
        public class FindNonNegativeAxisIndex {

            public static String getAxisIndex(int arr[][], int row, int col) {

                int rowCount = 0;
                int colCount = 0;
                if (row == 0 && col == 0)
                    return null;

                for (int i = 0; i < row; i++) {
                    rowCount = 0;
                    colCount = 0;
                    for (int j = 0; j < col; j++) {
                        if (arr[i][j] > 0) {

                            for (int k = 0; k < row; k++) {
                                if (arr[k][j] > 0)
                                    rowCount++;

                            }

                            for (int l = 0; l < col; l++) {
                                if (arr[i][l] > 0)
                                    colCount++;
                            }
                            if (rowCount == 1 && colCount == 1)
                                return i + " " + j;
                        }
                    }
                }

                return null;

            }

            public static void main(String[] args) {

                int arr[][] = { { 0, 0, 3, 0 }, { 0, 1, 0, 0 }, { 0, 0, 2, 4 },
                        { 5, 0, 0, 0 } };
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
                String value = getAxisIndex(arr, 4, 4);
                String index[] = value.split(" ");
                System.out.println("row " + index[0] + "  col " + index[1]);

            }

        }


        int[] expected = new int[]{1, 3};

        int[] actual = Matrix.indexOfFirstNonZero(matrix);

        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void testGetMinimumOfRows() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };
        for (int i = 0; i < matrix.length; i++) {
            int minInRow = matrix[i][0];
            int maxInRow = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (minInRow > matrix[i][j]) {
                    minInRow = matrix[i][j];
                }

                if (maxInRow < matrix[i][j]) {
                    maxInRow = matrix[i][j];
                }
            }
            System.out.println("Maximum in row is" + maxInRow);
            System.out.println("Minimum in row is " + minInRow);
            minInRow = matrix[i][0];
            maxInRow = matrix[i][0];

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(-72);
        expected.add(-88);
        expected.add(-97);
        expected.add(-64);
        expected.add(-84);

        ArrayList<Integer> actual = Matrix.getMinimumOfRows(matrix);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
    */
}