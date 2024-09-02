import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Operator opr = new Operator();
        

        System.out.print("input number : ");
        opr.value_1 = input.nextInt();

        System.out.print("choose operator ( + | - | * | / )");
        opr.operator = input.next().charAt(0);

        System.out.print("input number : ");
        opr.value_2 = input.nextInt();

        if (opr.operator == '+') {
            opr.sum();
        } else if (opr.operator == '-') {
            opr.sub();
        } else if (opr.operator == '*') {
            opr.multiply();
        } else if (opr.operator == '/') {
            opr.divided();
        } else {
            System.err.println("Invalid operator!");
        }
        

        System.out.println(opr.value_1 + " " + opr.operator + " " + opr.value_2 + " = " + opr.total);
    }
}