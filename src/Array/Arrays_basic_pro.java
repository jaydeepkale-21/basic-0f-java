package Array;
class num_check {
    void num_check(int arr[], int ele) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
    }

    void skip_ele(int arr[], int ele) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                i++;
                count++;
            }
            System.out.println(arr[i]);
        }
        if (count > 0) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }

    void skip_ele1(int arr[], int ele) {
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                cout++;
            }
        }
        if (cout == 0) {
            System.out.println("Not present");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ele) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    //    Find the prime number the array
    void prime_num(int arr[]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime number: " + num);
            }
        }
    }

    //    Another prime logic
    void prime_num1(int arr[]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            int count = 0;
            for (int j = 1; j <= Math.sqrt((int) num); j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Prime number: " + num);
            }
        }
    }

    void col_sum(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
                System.out.println(arr[j][i]);
            }
//            System.out.print("Column wise sum :");
//            System.out.print("="+sum);
//            System.out.println();
            System.out.println("|");
            System.out.print(sum);
            System.out.println();
            System.out.println("--------------------");


        }
    }

    //    check matrix currenrt or not
    void to_check(int arr[][]) {
        boolean bol = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    bol = false;
                }
            }
        }
        if ( bol==true) {
            System.out.println("yes it symmertric matrix");
        } else {
            System.out.println("not symmertric");
        }
    }
}

public class Arrays_basic_pro {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}};
        num_check n = new num_check();
        n.to_check(arr);
    }

}
