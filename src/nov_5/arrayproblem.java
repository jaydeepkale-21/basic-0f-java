package nov_5;

    public class arrayproblem {
        public static void main(String args[]) {
//            int arr[]={1,2,3,4,5,6};
//            for(int i=0;i<arr.length;i++){
//                for(int j=i+1;j<arr.length;j++){
//                    for (int k=j+1;k<arr.length;k++){
//                        int sum=arr[i]+arr[j]+arr[k];
//                        if(sum<=8) {
//                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + ":"+sum);
//                        }
//                    }
//                }
//            }
//            int arr[]={1,2,3,4,5,6,7,56,12,36,45,86,95,23};
////
//////            Prime logic
//            int count=0;
//            for(int i=0;i<arr.length;i++){
//                int n=arr[i];
//                for(int j=2;j<n;j++){
//                    if(n%j!=0){
//                        count++;
//                        break;
//                    }
//                }
//            }
//            System.out.println("Total prime number in array: "+count);


//            Another way to print prime number in array
//            int c=0;
//            for(int i=0;i<arr.length;i++){
//                int n=arr[i];
//                int count=0;
//                for(int j=1;j<=n;j++){
//                    if(n%j==0){
//                        count++;
//                    }
//                }
//                if(count==2){
//                    c++;
//                }
//            }
//            System.out.println("total prime number array: "+c);


//            colamn wise addtion
//                int arr[][]={{1,2,3},{4,5,6,},{7,8,9}};
//                for(int i=0;i<arr[0].length;i++){
//                    int sum=0;
//                    for (int j=0;j<arr.length;j++){
//                        sum+=arr[j][i];
//                    }
//                    System.out.println(sum);
//                }


//            Transfose of matrix
//            for int datatype
//            int arr1[][]={{1,2,3},
//                         {4,5,6},
//                         {7,8,9}};
//            int arr2[][]=new int[arr1[0].length][arr1.length];
//            for(int i=0;i<arr1.length;i++){
//                for(int j=0;j<arr1[0].length;j++){
//                    arr2[j][i]=arr1[i][j];
//                }
//            }
//
//            for(int i=0;i<arr2.length;i++){
//                for(int j=0;j<arr2[0].length;j++){
//                    System.out.print(arr2[i][j]);
//                }
//                System.out.println();
//            }


//      string datatype array
//            String arr1[][] = {{"jay", "deep", "kale"},
//                    {"sanket", "tusher", "om"}};
//            String arr2[][] = new String[arr1[0].length][arr1.length];
//            for (int i = 0; i < arr1.length; i++) {
//                for (int j = 0; j < arr1[0].length; j++) {
//                    arr2[j][i] = arr1[i][j];
//                }
//            }
//
//            for (int i = 0; i < arr2.length; i++) {
//                for (int j = 0; j < arr2[0].length; j++) {
//                    System.out.print(arr2[i][j]+" ");
//
//                }
//                System.out.println();
//            }

//            convertion 1d to 2d array
//            int D2[][]={{1,2,3},{4,5,6,},{7,8,9}};
//            int D1[]=new int[D2.length*D2[0].length];
//            int index=0;
//            for(int i=0;i<D2.length;i++){
//                for(int j=0;j<D2[i].length;j++){
//                    D1[index++]=D2[i][j];
//                }
//            }
////            Printing 1D array
//            for(int i=0;i<D1.length;i++){
//                System.out.print(D1[i]+" ");
//            }

//            convertion 1D to 2D

//        int arr1[]={1,2,3,4,5,6};
//        int arr2[][]=new int[arr1.length][arr1.length];
//        int index=0;
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<3;j++){
//                arr2[i][j]=arr1[index++];
//
//            }
//        }
//            for(int i=0;i<arr2.length;i++){
//                for(int j=0;j<arr2[0].length;j++){
//                    System.out.println(arr2[i][j]);
//                }
//            }

//            BASIC SORT
//            Ascending order sort
//            int arr[]={1,3,2,4};
//            System.out.println("before sort array: ");
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]+" "+i);
//            }
//            for(int i=0;i<arr.length;i++){
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[i]>arr[j]){
//                        int temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//            }
//            System.out.println("After sort array: ");
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]+" "+i);
//            }

//            Decending order sort
//            int arr[]={2,3,9,5,1};
//            System.out.println("before sort");
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//            }
//            for(int i=0;i<arr.length;i++){
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[i]<arr[j]){
//                        arr[i]=arr[i]+arr[j];
//                        arr[j]=arr[i]-arr[j];
//                        arr[i]=arr[i]-arr[j];
//                    }
//                }
//            }
//            System.out.println("after sort");
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//            }


//            Finding count of 4
            int arr[]={1,4,4,4,5,6};
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==4){
                    count++;
                }
            }
            System.out.println("Count of 4: "+count);
            }

        }


