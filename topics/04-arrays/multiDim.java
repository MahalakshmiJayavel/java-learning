public class multiDim {
    public static void main(String[] args) {
        // 2x2 original matrix
        int[][] original = {
            {1, 2 },
            {4, 5 }
        };

        int[][] transpose = new int[2][2];

        for (int i = 0; i < 2; i++) {         
            for (int j = 0; j < 2; j++) {     
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

