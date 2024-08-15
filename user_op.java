import java.util.Scanner;
class user_op{
public static void main(String args[]){
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b => ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Sum is = "+(a+b));
System.out.println("Substraction is = "+(a-b));
c=a+b;

System.out.println("Sum is = "+c);
d=a-b;

System.out.println("Substraction is = "+c);
}
}