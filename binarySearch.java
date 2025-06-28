import java.util.*;
public class binarySearch {
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

        Arrays.sort(arr);

        int low = 0;
        int high = n-1;
        int mid = 0;
        int count = 0;

        while(low <= high){
            mid = (low + high)/2;
            if (x > arr[mid]){
                low = mid + 1;
            }
            else if (x < arr[mid]){
                high = mid - 1;
            }
            else if (x == arr[mid]){
                count++;
            }
            else{
                System.out.println("Element Not Found");
            }   
        }
        System.out.println("no of times x occured: "+ count);
    }
}
