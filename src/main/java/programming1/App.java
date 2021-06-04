/*
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.


Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    final static DecimalFormat df2 = new DecimalFormat("#.00");
    public static void main(String[] args) {
        //final int MAX_ITEMS=3;
        final double TAX=0.055;
        Scanner in=new Scanner(System.in);

        double i1,i2,i3;
        int q;

        System.out.print("Enter the price of item 1: ");
        i1= in.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        q= in.nextInt();
        i1=i1*q;

        System.out.print("Enter the price of item 2: ");
        i2= in.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        q= in.nextInt();
        i2=i2*q;

        System.out.print("Enter the price of item 3: ");
        i3= in.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        q= in.nextInt();
        i3=i3*q;



        double total=i1+i2+i3;//Actually SUBTOTAL

        double tax=total*TAX;
        double Subt=total+tax;//ACTUALLY TOTAL

        String output= "Subtotal: $"+df2.format(total)+"\n"+"Tax: $"+tax+"\n"+"Total: $"+Subt;

        System.out.println(output);



    }
}
