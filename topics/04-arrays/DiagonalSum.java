public class DiagonalSum {
        public static void main(String[] args) {
            // Define a 2x2 matrix
            int[][] matrix = {
                {4, 2},
                {1, 3}
            };
    
            int DiagonalSum = 0;
    
            // Loop to sum main diagonal elements (matrix[0][0] + matrix[1][1])
            for (int i = 0; i < 2; i++) {
                DiagonalSum += matrix[i][i];
            }
    
            System.out.println("Sum of main diagonal elements: " + DiagonalSum);
        }
    }
    
    

