import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] time = new int[101];

        for (int i = 0; i < 3; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int t = start; t < end; t++) {
                time[t]++;
            }
        }

        int price = 0;
        for (int t = 1; t <= 100; t++) {
            if (time[t] == 1) {
                price += a;
            } else if (time[t] == 2) {
                price += 2 * b;
            } else if (time[t] == 3) {
                price += 3 * c;
            }
        }
        sc.nextLine();
        System.out.println(price);
    }
}