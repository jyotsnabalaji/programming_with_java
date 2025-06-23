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
    }
}
