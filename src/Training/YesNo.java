package Training;
import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number;");
        n = input.nextInt();
        if ((n%3 == 0) && (n%5 == 0));{
            System.out.println("YesNo");

        }else if (n%3 ==0){
            System.out.println("Yes");


        } else if (n%5 ==0 ) {
            System.out.println("No");


        }else {
            System.out.println("Both number is not divisible by 3 and 5");


        }

    }
}
