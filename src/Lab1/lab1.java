package Lab1;

import java.util.Scanner;

public class lab1 {
    static int a,b,result,i,fib,choice;
    public static void main(String[] args) {
        do{
            System.out.println("Menu");
            System.out.println("1.Calci");
            System.out.println("2.Factorial");
            System.out.println("3.Fibonacci");
            System.out.println("4.Roots");
            System.out.println("5.Exit");
            System.out.println("Enter your choice :");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            System.out.println("Your Choice - "+ch);

            switch (ch)
            {
                case 1:
                    System.out.println("Calci");
                    System.out.println("1.Sum");
                    System.out.println("2.Sub");
                    System.out.println("3.Mul");
                    System.out.println("4.Div");
                    System.out.println("5.Exit");
                    System.out.println("Enter your choice :");
                    int calc =scanner.nextInt();
                    switch (calc)
                    {
                        case 1:
                            System.out.println("SUM");
                            System.out.println("Enter the two numbers");
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            result = a+b;
                            System.out.println("The sum of "+a+" and "+b+" is :"+result);
                            break;
                        case 2:
                            System.out.println("SUB");
                            System.out.println("Enter the two numbers");
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            result = a-b;
                            System.out.println("The sub of "+a+" and "+b+" is :"+result);
                            break;
                        case 3:
                            System.out.println("Mul");
                            System.out.println("Enter the two numbers");
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            result = a*b;
                            System.out.println("The sum of "+a+" and "+b+" is :"+result);
                            break;
                        case 4:
                            System.out.println("Div");
                            System.out.println("Enter the two numbers");
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            result = a/b;
                            System.out.println("The sum of "+a+" and "+b+" is :"+result);
                            break;
                        case 5:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Happy New Year");
                    }
                    break;
                case 2:
                    System.out.println("Factorial");
                    System.out.println("Enter your Number");
                    i = scanner.nextInt();
                    if (i<0)
                    {
                        System.out.println("Null");
                    }
                    else if (i==0) {
                        System.out.println("Factorial of 0 is :1");
                    }
                    else
                    {
                        int fact = 1;
                        while (i!=0)
                        {
                            fact = fact*i;
                            i--;

                        }
                        System.out.println("The factorial of "+i+" is :"+fact);
                    }
                    break;
                case 3:
                    System.out.println("Fibonacci");
                    int n1 = 0, n2 = 1;
                    System.out.println("Enter num :");
                    fib = scanner.nextInt();
                    for (int i = 0; i < fib; i++) {
                        int num3 = n2 + n1;
                        n1 = n2;
                        n2 = num3;
                        result = num3;
                    }
                    System.out.println("The fibonacci"+fib+"is:"+result);
                    break;
                case 4:
                    System.out.println("Root");
                    System.out.println("Menu");
                    System.out.println("1.Square");
                    System.out.println("2.Cube");
                    System.out.println("3.Quad");
                    System.out.println("4.Exit");
                    int root_ch = scanner.nextInt();
                    switch (root_ch) {
                        case 1:
                            System.out.println("Square");
                            i = scanner.nextInt();
                            result = i*i;
                            System.out.println("The Square of"+i+" is:" +result);
                            break;
                        case 2:
                            System.out.println("Cube");
                            i = scanner.nextInt();
                            result = i*i*i;
                            System.out.println("The Cube of"+i+" is:" +result);
                            break;
                        case 3:
                            System.out.println("Quad");
                            i = scanner.nextInt();
                            result = i*i*i*i;
                            System.out.println("The Quad of"+i+" is:" +result);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=5);
    }
}

