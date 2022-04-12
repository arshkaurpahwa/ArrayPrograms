import java.util.*;
class print_Elements{
   
     public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
    int size = s.nextInt();
    int arr[]=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        for(int j=0;j<size;j++)
        {
            System.out.println(arr[j]);
        }

    }
    
}