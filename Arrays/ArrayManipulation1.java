import java.util.Scanner;

public class ArrayManipulation1 {
    public static void main(String[] args) {
        int toFind, count;
        int j = 0;
        int[] arrayNumbers = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
        int[] foundNumbers;

        Scanner input = new Scanner(System.in);

        System.out.println("Find a number in array!");
        System.out.print("Type the number you want to find: ");
        toFind = input.nextInt();
        count = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == toFind) {
                count++;
            }
        }
        foundNumbers = new int[count];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == toFind) {
                foundNumbers[j] = i;
                j++;
            }
        }
        if (count > 0) {
            System.out.println("Number " + toFind + " that you find is found in Array Numbers.");
            System.out.println("There's " + count + " number " + toFind + " in Array Numbers.\nIndex:");
            for (int u : foundNumbers) {
                System.out.print(u + " ");
            }
        } else {
            System.out.println("No Data Found");
        }

    }
}
