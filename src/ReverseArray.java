import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println("Original Array: ");
        for (int i : numbers) System.out.print(i + ", ");

        for (int j = 0; j < numbers.length / 2; j++) {
            int tmp = numbers[j];
            numbers[j] = numbers[numbers.length - 1 - j];
            numbers[numbers.length - 1 - j] = tmp;
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for (int i : numbers) System.out.print(i + ", ");
    }
}
