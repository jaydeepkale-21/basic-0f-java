package nov_5;

public class array {
    public static void main(String args[]) {
        int arr7[][] = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        for (int i = 0; i < arr7[0].length; i++) {
            int sum = 0;
            for (int j = 0; j<arr7.length; j++) {
                sum += arr7[j][i];
            }
            System.out.println(sum);
        }
    }
}