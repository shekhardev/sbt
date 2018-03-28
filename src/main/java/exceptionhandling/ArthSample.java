package exceptionhandling;

import java.util.*;

public class ArthSample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x=1;

        do {
            try {
                System.out.println("Enter First Number :");
                int n1 = input.nextInt();
                System.out.println("Enter Second Number :");
                int n2 = input.nextInt();

                int sum = n1 / n2;
                System.out.println(sum);
                x=2;

            } catch (Exception e) {
                System.out.println("You can not do that");
            }
        }while (x ==1);

        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound exception:s  hmm");
        }




    }
}
