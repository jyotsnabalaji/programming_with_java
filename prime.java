import java.util.Scanner;

public class prime {
    public static void main(String[] args){
    // System.out.println("Hello Worlds");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Test Cases: ");
    int t = sc.nextInt();

    for(int i=0; i<t; i++){
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int div=2; div*div<=n; div++){
            if(n%div == 0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
    sc.close();
}
}
