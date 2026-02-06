package Array;
class num_check{
    void num_check(int arr[],int ele){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                count++;
            }
        }
        if(count==0){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
    void skip_ele(int arr[],int ele){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                i++;
                count++;
            }
            System.out.println(arr[i]);
        }
        if(count>0){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }

    void skip_ele1(int arr[],int ele){
        int cout=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==ele){
                cout++;
            }
        }
        if(cout==0){
            System.out.println("Not present");
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=ele){
                    System.out.println(arr[i]);
                }
            }
        }
    }

//    Find the prime number the array
    void prime_num(int arr[]){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i];
            int count=0;
            for(int j=1;j<=num;j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime number: "+num);
            }
        }
    }

//    Another prime logic
void prime_num1(int arr[]){
    int num=0;
    for(int i=0;i<arr.length;i++) {
        num=arr[i];
        int count=0;
        for(int j=1;j<=Math.sqrt((int)num);j++){
            if(num%j==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("Prime number: "+num);
        }
    }
    }
    }

public class Arrays_basic_pro {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,8,11};
        int ele=3;
        num_check n=new num_check();
        n.prime_num(arr);
    }
}
