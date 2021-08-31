//Jibriel Ustarz
//CS1400
//Assignment 2
//2-16-2021
import java.util.Scanner;

public class TaskA
{
    public static void main(String[] args)
    {
        double amount;
        double butterg;
        double butteroz;
        double sugarg;
        double sugaroz;
        double plainflourg;
        double plainflouroz;
        double buttergamount;
        double butterozamount;
        double sugargamount;
        double sugarozamount;
        double plainflourgamount;
        double plainflourozamount;

        butterg = 5.20833333;
        butteroz = 0.16666667;
        sugarg = 2.29166667;
        sugaroz = 0.08333333;
        plainflourg = 7.5;
        plainflouroz = 0.25;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much shortbread would you like to make? ");
        amount = keyboard.nextDouble();

        buttergamount = butterg * amount;
        butterozamount = butteroz * amount;
        sugargamount = sugarg * amount;
        sugarozamount = sugaroz * amount;
        plainflourgamount = plainflourg * amount;
        plainflourozamount = plainflouroz * amount;

        System.out.println("You will need:" + buttergamount + "g/" + butterozamount + "oz");
        System.out.println(sugargamount + "g/" + sugarozamount + "oz");
        System.out.println(plainflourgamount + "g/" + plainflourozamount + "oz");
	System.out.println("Why did you add this?")


        




    }
}