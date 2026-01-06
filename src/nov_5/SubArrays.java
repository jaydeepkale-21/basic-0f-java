package nov_5;

public class SubArrays {
    public static void unique_pair_find(int arr[]) {
        int c = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int cout = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    cout++;
                }
            }
            if (cout == 0) {
                c++;
            }
        }
        int unique[] = new int[c];
        for (int i = 0; i < arr.length; i++) {
            int cout = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    cout++;
                }
            }
            if (cout == 0) {
                unique[index++] = arr[i];
            }
        }
        for (int i = 0; i < unique.length; i++) {
            for (int j = 0; j < unique.length; j++) {
                System.out.println(unique[i] + " " + unique[j]);
            }
        }

    }

    public static void Triple_pair(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                    sum = sum + arr[i] + arr[j] + arr[k];
                    System.out.println("=" + sum);
                }

            }

        }
    }

    public static void Effect_Triplate(int arr[], int pair) {
        for (int i = 0; i <= arr.length - pair ; i++) {
            for (int j = i; j < i+pair; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }

//    Using one loop
public static void Effect_Triplate_oneloop(int arr[], int pair) {
    for (int i = 0; i <= arr.length - pair ; i++) {
        System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
    }
//    System.out.println();
}


    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int pair = 3;
        Effect_Triplate_oneloop(arr, pair);


    }
}
