import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] num = new double[20];
        Scanner scanner = new Scanner(System.in);
        int num3 = 0;
        while (num3 <20){
            System.out.println("your place is "+num3+" out of 19");
            double num2 = scanner.nextDouble();
            num[num3] = num2;
            num3 += 1;
        }
        System.out.println(Arrays.toString(num));
    }

}