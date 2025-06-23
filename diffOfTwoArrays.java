import java.util.*;
public class diffOfTwoArrays {
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
        int []diffArray = new int[maxLength];
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diffArray.length-1;

        while(k >= 0){
            int d = 0;
            int arr1value = i >= 0? arr1[i]: 0;
            if (arr2[j] + carry >= arr1value){
                d = arr2[j] + carry - arr1value;
                carry = 0;
            } else {
                d = arr2[j] + carry + 10 - arr1value;
                carry = -1;
            }
            diffArray[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while(index < diffArray.length){
            if(diffArray[index] == 0){
                index++;
            }
            else{
                break;
            }
        }
        System.out.println("Difference of two arrays is: ");
        System.out.print("[");
        while(index < diffArray.length){
            System.out.print(diffArray[index] + " ");
            index++;
        }
        System.out.print("]");
        sc.close();
    }
}

