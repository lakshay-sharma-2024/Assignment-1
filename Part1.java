package Assignment_1;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Part1{
    public static int fact(int number) {

        if (number == 1 || number == 0) {
            return 1;
        }

        return number * fact(number - 1);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n"+"-------------Assignment Part-1---------------");
            System.out.println("1)Command line args");
            System.out.println("2)Scanner");
            System.out.println("3)Buffer Reader");
            System.out.println("4)DataInputStream");
            System.out.println("5)Console");
            System.out.println("Enter choice : ");
            String x = scanner.nextLine();
            if (Objects.equals(x,"end"))
                break;
            else
            {
                int y = Integer.parseInt((x));
                if (y <= 5 && y > 0)
                {
                    switch(y)
                    {
                        case 1:
                            for(String i :args)
                            {
                                System.out.println("Factorial for argument "+ i +" : "+fact(Integer.parseInt(i)));
                            }
                            break;
                        case 2:
                            System.out.println("Enter the number : ");
                            int num = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Factorial for input "+ num +" : "+fact(num));
                            break;
                        case 3:
                            InputStreamReader in = new InputStreamReader(System.in);

                            BufferedReader reader = new BufferedReader(in);
                            System.out.println("Enter the number :");
                            String num_2 = reader.readLine();
                            System.out.println("Factorial for input  "+ num_2 +" : "+fact(Integer.parseInt(num_2)));
                            break;
                        case 4:
                            DataInputStream dis = new DataInputStream(System.in);
                            System.out.print("Enter the number : ");
                            String num_3 = dis.readLine();
                            System.out.println("Factorial for input  "+ Integer.parseInt(num_3) +" : "+fact(Integer.parseInt(num_3)));

                            break;
                        default:
                            Console console = System.console();
                            if(console!=null) {
                                String input = console.readLine("Enter the number : ");
                                System.out.println("factorial for input : " + Integer.parseInt(input) + " : " + fact(Integer.parseInt(input)));
                            }
                            else {
                                System.out.println("Null encountered .");
                            }
                            break;
                    }
                }
                else
                    System.out.println(("Enter valid number ."));
            }
        } while (true);
        scanner.close();
    }
}
