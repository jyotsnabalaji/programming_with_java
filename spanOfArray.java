import java.util.*;
public class spanOfArray {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no of elements in the array:");
    int n = sc.nextInt();
    int []arr = new int[n];

    System.out.println("Enter the Elements in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    int max = arr[n-1];
    int min = arr[0];
    int span = 0;

    for(int i=0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    span = max - min;
    System.out.println("Difference between max:"+ max + " and min:" + min + " is " + span);

    } 

    
}
