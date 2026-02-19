package Array;
class student{
    void find_uniq(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){   //1==2, 1==3, 1==3, 1==3, 1==4, 1==5
                    count++;         //2==3, 2==3, 2==3, 2==4, 2==5
                }                    //3==3, 3==4, 3==5   count=1-> not consider all comparesion
            }                        //3==4, 3==5
                                     //4==5
            if(count==0){

                int feq=0;
                for (int k=0;k<arr.length;k++){
                if (arr[k]==arr[i]){
                    feq++;
                }
                }
                System.out.println("original element: "+arr[i]+" count is: "+feq);

            }
        }
    }

//    another way
    void find_uniq_byarr(int arr[]){
        int n=0;
        for(int i=0;i<arr.length;i++){
            n=Math.max(arr[i],n);
        }
        int ans[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>0){
                System.out.println(i+"="+ans[i]);
            }
        }
    }
}
public class array_problem_feb10 {
    public static void main(String args[]){
        int arr[]={1,2,3,3,4,5,26};
        student s=new student();
//        s.find_uniq(arr);
        s.find_uniq_byarr(arr);
    }
}
