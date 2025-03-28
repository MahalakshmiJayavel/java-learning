public class DiagonalSum {
        public static void main(String[] args) {
            
            int[][] matrix = {
                {4, 2},
                {1, 3}
            };
    
            int DiagonalSum = 0;
     
            for (int i = 0; i < 2; i++) {
                DiagonalSum += matrix[i][i];
            }
    
            System.out.println("Sum of main diagonal elements: " + DiagonalSum);
        }
    }
    
    

