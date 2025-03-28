public class Average {
        public static void main(String[] args) {
            int[] numbers = {15,20,16,5,7};
    
            int sum = 0;
    
            for (int num : numbers) {
                sum += num;
            }
    
            double average = (double) sum / numbers.length;
    
            System.out.println("Average: " + average);
        }
    }
    
