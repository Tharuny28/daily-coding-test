import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner mad = new Scanner(System.in);
        
        System.out.println("Enter number of rows and columns:");
        int rows = mad.nextInt();
        int cols = mad.nextInt();
        
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = mad.nextInt();
            }
        }
        
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
      
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
        
        mad.close();
    }
}
