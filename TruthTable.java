package cs501_hw;
import java.util.Scanner;

public class TruthTable {
	public static void main (String args[]){
        printTruthTable(1);
        printTruthTable(2);
        printTruthTable(3);
        System.out.print("How many inputs do you want?");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        printTruthTable(k);
    }

    private static void printTruthTable(int n) {
        System.out.println("------------Truth table of " +
                "" + n + " inputs function --------------");
        int rows = (int) Math.pow(2, n);

        if (n <= 3) {
            for (int i = 0; i < rows; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print((i / (int) Math.pow(2, j)) % 2 + " ");
                }
                System.out.println();
            }
        }
        System.out.println("For " + n + " inputs, table size is  " + rows);
        System.out.println();
}
}


