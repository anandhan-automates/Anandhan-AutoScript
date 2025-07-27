import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int size = 0;
         int sum =0;
         System.out.println("Enter size of the array:");
         size = sc.nextInt();
         int[] arr = new int[size];
         int[] arr1 = {1,2,3,4,5};//Array declration with values
         for(int i=0; i<size; i++)
         {
        	 arr[i]=sc.nextInt();
         }
         for(int i=0;i<size;i++)
         {
        	 sum= sum + arr[i];
         }
         System.out.println("Sum of value of array is:"+sum);
         
         // 10 x 10 grid
         
         for (int i=0 ; i<10;i++)
         {
        	 for(int j=0 ; j<10;j++)
        	 {
        		System.out.print("-"+" ");
        	 }
        	 System.out.println();
         }
	}

}
