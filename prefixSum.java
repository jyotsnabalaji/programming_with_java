import java.util.*;
public class prefixSum {

    static void reverseArrayInPlace(int []arr){
        int x = 0;
        int y = arr.length-1;
        for (int i=0; i<arr.length; i++){
            if(x<y){
                swap(arr, x, y);
            }
            x++;
            y--;
        }
    }

    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }

        return pref;
    }

    static void makePrefixSumArrayInPlace(int[] arr){
        int n = arr.length;

        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
    }

    static int prefixSumWithIndex(int []arr, int l, int r){
        int sum = 0;

        for(int i=l; i<=r; i++){
            sum = sum + arr[i-1];
        }

        return sum;
    }

    static void printArray(int []arr){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
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

        int x = 0;
        int target = 0;
        int q = 0;
        
        do{
            System.out.println("");
            System.out.println("What do you want to do with the array??");
            System.out.println("Options: ");
            System.out.println("1. Prefix Sum Array");
            System.out.println("2. Prefix Sum Array in place");
            System.out.println("3. Prefix Sum with start and end indices");
            System.out.println("Enter the Option");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Given array: ");
                    printArray(arr);
                    int [] prefixArray = makePrefixSumArray(arr);
                    System.out.print("The Prefix Sum Array is: ");
                    printArray(prefixArray);
                    break;
                case 2:
                    System.out.print("Given array: ");
                    printArray(arr);
                    makePrefixSumArrayInPlace(arr);
                    System.out.print("The Prefix Sum Array is: ");
                    printArray(arr);
                    break;
                case 3:
                    System.out.println("Enter the number of queries:");
                    q = sc.nextInt();
                    while(q>0){
                        int sum = 0;
                        System.out.println("Enter l:");
                        int l = sc.nextInt();

                        System.out.println("Enter r:");
                        int r = sc.nextInt();

                        sum = prefixSumWithIndex(arr, l, r);
                        System.out.println("Prefix sum from "+l+" to "+r+" is "+sum);
                        q--;
                    }
                    
                default:
                    System.out.println("Invalid option.");
                    break;
                }
        } while(true);
    }
}
