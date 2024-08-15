import java.util.Scanner;
class user_ter{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b = ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Value of a and b is =>"+a+" and "+b);
c=(a>b)?a:b;
System.out.println("Result is = "+c);
}
}
