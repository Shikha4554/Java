import java.util.Scanner;
class user_incr{
public static void main(String args[]){
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a = ");
a=sc.nextInt();
System.out.println("PreIncrement = "+(++a));
System.out.println("PostIncrement = "+(a++));
System.out.println("Value of a = "+ a);
}
}

