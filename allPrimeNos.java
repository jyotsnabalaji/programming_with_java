import java.util.Scanner;

public class allPrimeNos {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Test Cases: ");
    int t = sc.nextInt();

    for(int i=0; i<t; i++){
        System.out.println("Enter the limit to print prime numbers: ");
        int n = sc.nextInt();
        for(int j=2; j<=n; j++){
            int count = 0;
            for(int div=2; div*div<=j; div++){
                if(j%div == 0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(j);
            }
        }
    }
    sc.close();
    }
}
