import java.util.Scanner;

public class LexicallySmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] result = lexicallySmallestArray(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }

    public static int[] lexicallySmallestArray(int arr[], int k) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[j] - arr[i] <= k) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            } else {
                j--;
            }
        }
        return arr;
        

        
    }
}
