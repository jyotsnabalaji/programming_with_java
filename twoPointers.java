import java.util.*;
public class twoPointers {

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

    static void sortBinaryArray(int []arr){
        int countZeroes = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                countZeroes++;
            }
        }
        for(int i=0; i<countZeroes; i++){
            arr[i] = 0;
        }
        for(int i=countZeroes; i<arr.length; i++){
            arr[i] = 1;
        }
    }

    // sort the given binary array in single traversal
    static void sortBinaryArrayOptimal(int []arr){
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
            
    }

    static void sortOddsAndEvens(int []arr){
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left<right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
            
    }

    static int[] sortSquares(int []arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int [] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArrayInPlace(ans);

        return ans;
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
        int k = 0;
        
        do{
            System.out.println("");
            System.out.println("What do you want to do with the array??");
            System.out.println("Options: ");
            System.out.println("1. sort a binary array");
            System.out.println("2. sort a binary array in single traversal");
            System.out.println("3. sort a given array such that even numbers are placed in the left and odd in the right within single traversal");
            System.out.println("4. return an array with squares of the elements in the original array in a non-decreasing order");
            System.out.println("Enter the Option");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("array before sorting: ");
                    printArray(arr);
                    sortBinaryArray(arr);
                    System.out.print("array after sorting: ");
                    printArray(arr);
                    break;
                case 2:
                    System.out.print("array before sorting: ");
                    printArray(arr);
                    sortBinaryArrayOptimal(arr);
                    System.out.print("array after sorting: ");
                    printArray(arr);
                    break;
                case 3:
                    System.out.print("array before sorting: ");
                    printArray(arr);
                    sortOddsAndEvens(arr);
                    System.out.print("array after sorting: ");
                    printArray(arr);
                    break;
                case 4:
                    int []squaresArray = sortSquares(arr);
                    System.out.print("resultant squares array after sorting: ");
                    printArray(squaresArray);
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
                }
        } while(true);
    }
}
