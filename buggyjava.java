import java.util.Scanner;

public class BuggyJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        System.out.print("Enter size: ");
        size = sc.nextInt();

        arr = new int[size];

        for (int i = 0; i <= size; i++) {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum =+ arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
