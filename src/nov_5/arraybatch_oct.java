package nov_5;

public class arraybatch_oct {
    public static void main(String args[]){


////        First Way TO Find Unique Element
//        int c=0;
//        int arr[]={1,2,3,3,2,1,4};
//        for (int i=0;i< arr.length;i++){
//            int cout=0;
//            for (int j=0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    cout++;
//                }
//            }
//            if(cout==0){
//                c++;
//            }
//        }
//
////        Unique Element store in Array B
//        int b[]=new int[c];
//        int index=0;
//        for (int i=0;i< arr.length;i++){
//            int cout=0;
//            for (int j=0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    cout++;
//                }
//            }
//            if(cout==0){
//                b[index]=arr[i];
//                index++;
//            }
//            }
//        System.out.println("Element of B->array:");
//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }


//        Second Way TO find Unique Element
        int arr[]={1,2,3,3,2,1,4};
        int c=0;
        for(int i=0;i<arr.length;i++){
            int cont=0;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cont++;
                }
            }
            if(cont==0){
              c++;
            }
        }
        int b[]=new int[c];
        int index=0;
        for(int i=0;i<arr.length;i++){
            int cont=0;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cont++;
                }
            }
            if(cont==0){
                b[index]=arr[i];
                index++;
            }
        }
        System.out.println("Unique Element Store In B");
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
