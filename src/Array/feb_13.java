package Array;

public class feb_13 {
    public static void find_unique_pair(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c == 1) {
                count++;
                System.out.println("unique pair :" + arr[i]);
            }
        }
//        B array created to store unique pair
        int b[] = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c == 1) {
                b[index++] = arr[i];
            }
        }

//Printing b subarray
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }


    //        Printing even staring and odd last
    public static void print_even_odd(int arr[]) {
        int b[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                b[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                b[index++] = arr[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);
        }
    }

    //            Positive and negative sepration
    public static void print_positive_negative(int arr[]) {
        int b[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                b[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                b[index++] = arr[i];
            }
        }
//                print b array
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);
        }
    }

    //                Bubble sort
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {   //i=0                       i<3
            for (int j=i+1;j<arr.length;j++)     //j=0                       j<2
                if (arr[j] > arr[j + 1]) {         //1>2
                    int temp = arr[j];             //temp=1
                    arr[j] = arr[j + 1];           //arr[i]=2
                    arr[j + 1] = temp;             //arr[j+1]=1
                }

//

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }




    public static void main(String args[]){
        int arr[]={1,2,1};
//        find_unique_pair(arr);
//        print_even_odd(arr);
//        print_positive_negative(arr);
        bubble_sort(arr);
    }
}
