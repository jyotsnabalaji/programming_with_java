import java.util.*;
public class digitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int nod = 0;
        int temp = n;
        while(temp > 0){
            temp = temp/10;
            nod++;
        }
        int div = (int)Math.pow(10, nod-1);
        while(div!=0){
            int q = n/div;
            System.out.println(q);
            
            n = n%div;
            div = div/10;
        }
        sc.close();
    }
    
}
