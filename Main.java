public class Main {

    public static void main(String[] args) {
        // Create a 2x3 matrix with values
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Calculate and print the sum of all elements
        int sum = sumMatrix(matrix);
        System.out.println("\nSum of elements: " + sum);

        // Transpose and print the matrix
        System.out.println("\nTransposed Matrix:");
        int[][] transposed = transposeMatrix(matrix);
        printMatrix(transposed);
    }

    // Method to print matrix in table format
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t"); // Print value with tab spacing
            }
            System.out.println(); // Move to next row
        }
    }

    // Method to calculate total sum of matrix
    public static int sumMatrix(int[][] mat) {
        int sum = 0;
        for (int[] row : mat) {
            for (int val : row) {
                sum += val; // Add each value to sum
            }
        }
        return sum;
    }

    // Method to transpose the matrix (swap rows and columns)
    public static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length;        // 2 rows
        int cols = mat[0].length;     // 3 columns
        int[][] transposed = new int[cols][rows]; // Create new transposed matrix

        // Loop through original matrix and swap rows/cols
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = mat[i][j]; // Swap elements
            }
        }
        return transposed; // Return the new matrix
    }
}
