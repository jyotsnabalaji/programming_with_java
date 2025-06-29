import java.util.*;
public class lastOccurence {

   static int lastOccurenceArray(int []arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
   }
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements in the array:");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter the Elements in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to be searched: ");
        int x = sc.nextInt();

        int last = lastOccurenceArray(arr, x);
        if (last != -1){
            System.out.println("Last Occurence of "+ x + " is " + last);
        }
        else{
            System.out.println("Element Not Found");
        }

   } 
}
