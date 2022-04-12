import java.util.*;
public class BubbleSort {
    public static void main(String []args) {
        Scanner s=new Scanner (System.in);
    int size = s.nextInt();
    int arr[]=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

                                         // Bubble Sort Logic
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
                                           // Bubble Sort Logic
        for(int j=0;j<size;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
