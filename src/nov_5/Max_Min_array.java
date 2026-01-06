package nov_5;

public class Max_Min_array {
//    Differnet possilable condition
//    max=0;
//    max=arr[0];
//    max=Integer.MIN_VALUE;
//
//    min=a[0];
//    min=Integer.MAXVALUE;
    public static void IndexMethod_findMinMax(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is: "+min);
    }
    public static void PredefineValue_findMinMax(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);
        System.out.println("Minimum value is: "+min);
    }
    public static void array_MixProblem(int arr[],int pair){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int index=0;
        float avg=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length-1;j++){
                System.out.print(arr[i]+" "+arr[j]+" "+arr[j+1]);
                sum=arr[i]+arr[j]+arr[j+1];
                System.out.println("="+sum);
                if(min>sum){
                    min=sum;
                    index=i;
                }
            }
        }
        System.out.println("Minimum is: "+min+" ");
        System.out.println("Averge is: "+min/pair);
    }
    public static  void main(String args[]){
        int arr[]={1,2,3,4,5,6};
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
        System.out.println("array sum is: "+sum);
    }
}
