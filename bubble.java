import java.util.Scanner;

class bubble {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the size of the array \t");
        int n=sc.nextInt();
        System.out.println("enter the element of the array");
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
          sc.close();
        for(int i=0;i<4;i++)
        {
            for (int j=0;j<4-i-1;j++){
                if(arr[j]>arr[j+1]){
        //swap the elements 
                    int temp=arr[j];
                    arr[j]=arr[j+1] ;
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("the sorted array is \t ");
    for(int i=0;i<4;i++)
    System.out.println(arr[i]+" ");
    }
}