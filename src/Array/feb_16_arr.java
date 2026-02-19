package Array;

public class feb_16_arr {
    public static void inner_ele(int arr[][]) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Avrage is: " + (sum / count));
    }

    public static void outer_arr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[0].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

        public static void digonal_ele(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(i!=j){
                        System.out.print(arr[i][j]);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {7, 6, 5, 4}
        };
//        outer_arr(arr);
        digonal_ele(arr);
    }

}