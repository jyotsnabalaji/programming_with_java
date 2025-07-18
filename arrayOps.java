
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

   static int targetTwoSum(int []arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
   }

   static int targetThreeSum(int []arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == target){
                    count++;
                }
            }
        }
    }
        return count;
    }

    static int uniqueInArray(int []arr){
        int []countArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            countArr[i] = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countArr[i]++;
                }
            }
        }
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] == 1){
                return arr[i];
            }
        }
        return -1;
    }

    static int firstDuplicateInArray(int []arr){
        int []countArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            countArr[i] = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countArr[i]++;
                }
            }
        }
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] > 1){
                return arr[i];
            }
        }
        return -1;
    }

    static int findMax(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int secondLargest(int []arr){
        int max = findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int []revArray = new int[n];
        int pos = -1;
        for(int i=0; i<n; i++){
            revArray[i+n+pos] = arr[i];
            pos-=2;
        }
        return revArray;
    }

    static void reverseArrayInPlace(int []arr){
        int x = 0;
        int y = arr.length-1;
        int temp = 0;
        for (int i=0; i<arr.length; i++){
            if(x<y){
                temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            x++;
            y--;
        }
    }

    static void reverse(int []arr, int i, int j){
        int temp = 0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[] rotateArray(int []arr, int k){
        int n = arr.length;
        k = k%n;
        int j=0;
        int []rotateArray = new int[n]; 

        for(int i=n-k; i<n; i++){
            rotateArray[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            rotateArray[j++] = arr[i];
        }
        return rotateArray;
    }

    static void rotateArrayInPlace(int []arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    static int[] removeDuplicate(int []arr){
        int []countArr = new int[arr.length];
        int []uniqueArr = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            countArr[i] = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countArr[i]++;
                }
            }
        }
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] == 1){
                uniqueArr[i] = arr[i];
            }
        }
        return uniqueArr;
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
            System.out.println("1. Find the first occurence of X in an array");
            System.out.println("2. Find the count of elements strictly greater than X");
            System.out.println("3. Check whether the given array is sorted or not");
            System.out.println("4. Find the Kth Smallest and Kth Largest Element in an array");
            System.out.println("5. Find the target two sum count of array");
            System.out.println("6. Find the target three sum count of array");
            System.out.println("7. Find the unique element in the given array");
            System.out.println("8. Find the second largest element in the given array");
            System.out.println("9. Find the first duplicate element in the given array");
            System.out.println("10. Reverse the given array");
            System.out.println("11. Reverse the given array In Place");
            System.out.println("12. Rotate the given array");
            System.out.println("13. Rotate the given array In Place");
            System.out.println("14. Remove Duplicates");
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
                    k = sc.nextInt();
                    int []kthArray = kthSmallestInArray(arr, k);
                    System.out.println("");
                    System.out.println("Output Array is: ");
                    printArray(kthArray);
                    break;
                case 5:
                    System.out.println("Enter Target: ");
                    target = sc.nextInt();
                    int pairs = targetTwoSum(arr, target);
                    System.out.println("The No of pairs that sum up to "+target+ " is "+pairs);
                    break;
                case 6:
                    System.out.println("Enter Target: ");
                    target = sc.nextInt();
                    int triplets = targetThreeSum(arr, target);
                    System.out.println("The No of triplets that sum up to "+target+ " is "+triplets);
                    break;
                case 7:
                    int unique = uniqueInArray(arr);
                    System.out.println("The unique element is "+unique);
                    break;
                case 8:
                    int secondMax = secondLargest(arr);
                    System.out.println("The second max element is "+secondMax);
                    break;
                case 9:
                    int firstDuplicate = firstDuplicateInArray(arr);
                    System.out.println("The first duplicate element is "+firstDuplicate);
                    break;
                case 10:
                    int []revArray = reverseArray(arr);
                    printArray(revArray);
                    break;
                case 11:
                    reverseArrayInPlace(arr);
                    printArray(arr);
                    break;
                case 12:
                    System.out.println("Enter k:");
                    k = sc.nextInt();
                    int []rotatedArray = rotateArray(arr, k);
                    System.out.print("Array before rotation: ");
                    printArray(arr);
                    System.out.print("Array after rotation: ");
                    printArray(rotatedArray);
                    break;
                case 13:
                    System.out.println("Enter k:");
                    k = sc.nextInt();

                    System.out.print("Array before rotation: ");
                    printArray(arr);

                    rotateArrayInPlace(arr, k);

                    System.out.print("Array after rotation: ");
                    printArray(arr);
                    break;
                case 14:

                    int []uniqueArr = removeDuplicate(arr);
                    printArray(uniqueArr);
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
                }
        } while(true);
 
   } 
}