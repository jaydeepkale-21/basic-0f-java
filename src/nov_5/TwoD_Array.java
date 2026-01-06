package nov_5;

public class TwoD_Array {
    public static void Row_addition(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int Row_sum = 0;//--> row wise addition
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                Row_sum = Row_sum + arr[i][j];
            }
            System.out.println("=" + Row_sum);
        }
    }
    public static void Col_addition(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int Col_sum = 0;//--> row wise addition
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i] + " ");
                Col_sum = Col_sum + arr[j][i];
            }
            System.out.println("=" + Col_sum);
        }
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        Row_addition(arr);
        Col_addition(arr);
    }
}
