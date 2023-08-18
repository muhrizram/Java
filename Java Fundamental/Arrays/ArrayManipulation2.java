import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[] args) {
        int change, newValue;
        int[] arrayNumbers = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
        Scanner input = new Scanner(System.in);

        System.out.println("Array Numbers:");
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("Changing the value of an array! ");
        do {
            System.out.print("Enter index position to change: (1-10) ");
            change = input.nextInt();
        } while (change < 0 || change > 10);
        System.out.print("Enter new value: ");
        newValue = input.nextInt();
        arrayNumbers[change - 1] = newValue;
        System.out.print("Arrays after changed");
        System.out.print(Arrays.toString(arrayNumbers));
    }
}
