public class Bubblesort {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 3};

        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

        for (int n : a)
            System.out.print(n + " ");
    }
}
