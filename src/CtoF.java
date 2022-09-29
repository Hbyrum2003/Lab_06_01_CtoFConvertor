import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {

//executable code + defining inputs
        Scanner celsius = new Scanner(System.in);
        double temp = 0;
        String trash="";
        System.out.println(" Enter your temperature in celsius");

        //if statements + executing code
        if (celsius.hasNextDouble())
        {
          temp = celsius.nextDouble();
          celsius.nextLine();

            double Farhrenheit = temp * 1.8 + 32.0;
            System.out.println("Your temperature in farhrenheit is : " + Farhrenheit);}
        else
        //trash code aka what to do whenever they input a false input
        {
            trash= celsius.nextLine();
            System.out.println("You said you temperature was: " + trash);
            System.out.println("Run the program again and run a correct input");
            System.exit(0);
        }
}
}


