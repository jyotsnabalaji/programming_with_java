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

    static void swap(int []    arr, int i, int j){
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


    // This needs an extra loop to calculate the from index to index.
    // This can be done easily with O(1) complexity if we already have prefix sum array.
    // suppose i have an array of 5 elements, if i want the sum of elements from index 3 to 5 alone,
    // I will do pref[5] - pref[2]
    // that is pref[right-1] - pref[left-2] (since array indexing is from 0)
    // by this method, we can easily print the sum from one index to other index with less time complexity

    static int prefixSumWithIndex(int []arr, int l, int r){
        int sum = 0;

        for(int i=l; i<=r; i++){
            sum = sum + arr[i-1];
        }

        return sum;
    }

    static int prefixSumWithIndexOptimal(int []arr, int l, int r){
        int sum = 0;
        int []pref = makePrefixSumArray(arr);
        if (l == 1) {
        return pref[r - 1];
        } else {
        sum = pref[r-1] - pref[l-2];
        return sum;
        }
    }

    static boolean subArraySum(int []arr){
        int n = arr.length;
        int leftHalf = n/2;
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<leftHalf;i++){
            leftSum = leftSum+arr[i];
        }
        for(int i=leftHalf; i<n;i++){
            rightSum = rightSum+arr[i];
        }
        if(leftSum == rightSum){
            return true;
        }
        return false;
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
            System.out.println("4. Prefix Sum with start and end indices Optimal");
            System.out.println("5. Check if the sum of sub arrays are equal or not");
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
                    break;
                case 4:
                    System.out.println("Enter the number of queries:");
                    q = sc.nextInt();
                    while(q>0){
                        int sum = 0;
                        System.out.println("Enter l:");
                        int l = sc.nextInt();

                        System.out.println("Enter r:");
                        int r = sc.nextInt();

                        sum = prefixSumWithIndexOptimal(arr, l, r);
                        System.out.println("Prefix sum from "+l+" to "+r+" is "+sum);
                        q--;
                    }
                    break;
                case 5:
                    System.out.print("Given array: ");
                    printArray(arr);
                    boolean isSubArraySumEqual = subArraySum(arr);
                    System.out.print(isSubArraySumEqual);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
                }
        } while(true);
    }
}
