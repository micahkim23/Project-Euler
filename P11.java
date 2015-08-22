import java.util.Scanner;
import java.io.*;
public class P11 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("problem11.txt"));
        int[][] nums = new int[20][20];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) { 
                int a = reader.nextInt();
                nums[i][j] = a;
            }
        }
        int product = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                int a = nums[i][j] * nums[i][j+1] * nums[i][j+2] * nums[i][j+3];
                if (a > product) {
                    product = a;
                }
            }
        }

        for (int i = 0; i < 20; i++ ) {
            for (int j = 0; j < 17; j++) {
                int a = nums[j][i] * nums[j+1][i] * nums[j+2][i] * nums[j+3][i];
                if (a > product) {
                    product = a;
                }
            }
        }
        
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                int a = nums[i][j] * nums[i+1][j+1] * nums[i+2][j+2] * nums[i+3][j+3];
                if (a > product) {
                    product = a;
                }
            }
        }
        
        for (int i = 0; i < 17; i++) {
            for (int j = 3; j < 20; j++) {
                int a = nums[i][j] * nums[i+1][j-1] * nums[i+2][j-2] * nums[i+3][j-3];
                if (a > product) {
                    product = a;
                }
            }
        }
        
        System.out.println(product);
    }
}
