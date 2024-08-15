import java.util.Scanner;
class user_gate{
public static void main(String args[]){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b = ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Value of a and b is =>"+a+" and "+b);
System.out.println((a>b)&&(a>=b));
System.out.println((a<b)&&(a>=b));
System.out.println((a<b)&&(a<=b));
System.out.println((a>b)||(a>=b));
System.out.println((a<b)||(a>=b));
System.out.println((a<b)||(a<=b));

}
}

