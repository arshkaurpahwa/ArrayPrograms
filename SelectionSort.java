import java.util.*;
public class SelectionSort {
    public static void main(String []args) {
        Scanner s=new Scanner (System.in);
    int size = s.nextInt();
    int arr[]=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        // Selection Sort Logic

        for(int i=0;i<size-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }


        // Selection Sort Logic
        for(int j=0;j<size;j++)
        {
            System.out.println(arr[j]);
        }
}
}