import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        System.out.println(total - sum);
    }
}
