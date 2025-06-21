import java.util.*;
public class sumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];

        System.out.println("Enter elemtents of array 1: ");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];

        System.out.println("Enter elemtents of array 2: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int maxLength = Math.max(n1, n2);
        int []sumArray = new int[maxLength];
        
        for(int i=0; i<maxLength; i++){
            int val1 = (i < n1) ? arr1[i] : 0;
            int val2 = (i < n2) ? arr2[i] : 0;
            sumArray[i] = val1 + val2;
        }

        for(int i = 0; i<sumArray.length; i++){
            System.out.print(sumArray[i] + " ");
        }
        
    }
}
