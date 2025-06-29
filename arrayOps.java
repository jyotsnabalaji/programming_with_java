import java.util.*;
public class arrayOps {

   static int firstOccurenceArray(int []arr, int x){
        int firstIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                firstIndex = i;
                break;
                }
            }
        return firstIndex;
   }
   static int findStrictlyGreater(int []arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > x){
                count++;
            }
        }
        return count;
   }
   static boolean isSorted(int []arr){
        boolean sorted = false;
        int sortCountAscend = 0;
        int sortCountDescend = 0;
        for (int i=0, j=1; j<arr.length; i++,j++){
            if(arr[i] <= arr[j]){
                sortCountAscend++;
            }
            else if(arr[i] >= arr[j]){
                sortCountDescend++;
            }
        }
        if ((sortCountAscend == arr.length-1) || (sortCountDescend == arr.length-1)){
            sorted = true;
        }
        return sorted;
   }

   static int [] kthSmallestInArray(int []arr, int k){
        Arrays.sort(arr);
        System.out.println("Sorted Array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int []kthArray = new int[2];
        kthArray[0] = arr[k-1];
        kthArray[1] = arr[arr.length-k];
        return kthArray;
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
        
        do{
        System.out.println("What do you want to do with the array??");
        System.out.println("Options: ");
        System.out.println("1. Find the first occurence of X in an array");
        System.out.println("2. Find the count of elements strictly greater than X");
        System.out.println("3. Check whether the given array is sorted or not");
        System.out.println("4. Find the Kth Smallest and Kth Largest Element in an array");

        System.out.println("Enter the Option");
        int option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Enter the Element X: ");
                x = sc.nextInt();
                int first = firstOccurenceArray(arr, x);
                if (first != -1){
                    System.out.println("First Occurence of "+ x + " is " + "at " + "index no " + first);
                }
                else{
                    System.out.println("Element Not Found");
                }
                break;
            case 2:
                System.out.println("Enter the Element X: ");
                x = sc.nextInt();
                int count = findStrictlyGreater(arr, x);
                System.out.println("Count of elements strictly greater than " + x + " is "+ count);
                break;
            case 3:
                boolean isSorted = isSorted(arr);
                if(isSorted){
                    System.out.println("The Given Array is sorted");
                }
                else{
                    System.out.println("The Given Array is not sorted");
                }
                break;
            case 4:
                System.out.println("Enter K: ");
                int k = sc.nextInt();
                int []kthArray = kthSmallestInArray(arr, k);
                System.out.println("");
                System.out.println("Output Array is: ");
                printArray(kthArray);
                break;

            default:
                System.out.println("Invalid option.");
                break;
            }
        } while(true);
 
   } 
}

