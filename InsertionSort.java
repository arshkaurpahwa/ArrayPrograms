import java.util.*;
public class InsertionSort 
{
    public static void main(String []args) 
    {
        Scanner s=new Scanner (System.in);
    int size = s.nextInt();
    int arr[]=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        // Insertion Sort Logic
        int temp,j;
        for(int i=1;i<arr.length;i++)
        {
            temp=arr[i];
            j=i;

            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        
        // Insertion Sort Logic
        for(int k=0;k<size;k++)
        {
            System.out.println(arr[k]);
        }
}
}
