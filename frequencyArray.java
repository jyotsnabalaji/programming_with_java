import java.util.*;
class frequencyArray{

    static int[] makeFrequencyArray(int []arr, int n){
        int []freqArray = new int[100005];

        for(int i=0; i<n; i++){
            freqArray[arr[i]]++;
        }

        return freqArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        System.out.println("Enter the no of elements in the array");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int []freqArray = makeFrequencyArray(arr, n);

        while(q > 0){
            System.out.println("Enter the element to search");
            int x = sc.nextInt();

            if(freqArray[x] > 0){
            System.out.println("YES THE ELEMENT IS FOUND");
            }
            else{
                System.out.println("NO THE ELEMENT IS NOT FOUND");
            }
            q--;
        }

    }
}