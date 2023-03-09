package arr;


import java.util.Arrays;

/**
 * 旋转图像
 *
 */
public class RouateImage {

    public static int[][] rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int j = matrix.length - i - 1;
            int[] t = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = t;
        }
        for (int i = 0; i < matrix.length; i++) {
            //i + 1是为了只保证只替换由矩阵对角线分隔开的一半元素
            for (int j = i + 1; j < matrix.length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }
}
