import java.util.*;
public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the element: ");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor=max; floor>=1; floor--){
            for(int i=0; i<n; i++){
                if (arr[i] >= floor){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
 