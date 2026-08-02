import java.util.*;

public class searchInMatrix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of row and column");

        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter numbers of matrix");

        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input number to be searched");

        int find = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == find) {
                    System.out.println("Row is " + (i + 1) + "and column is " + (j + 1));
                    return;
                }
            }
        }

        System.out.print("Number not found");

    }
}
