import java.util.Scanner;
class User_input{
public static void main(String args[]){
int num1;
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the number");
num1=sc.nextInt();
System.out.println("Number is = "+num1);
float num2;
Scanner fc=new Scanner(System.in);
System.out.println("Enetr the number");
num2=fc.nextFloat();
System.out.println("Number is = "+num2);
double num3;
Scanner dc=new Scanner(System.in);
System.out.println("Enetr the number");
num3=dc.nextDouble();
System.out.println("Number is = "+num3);
char num4;
Scanner cc=new Scanner(System.in);
System.out.println("Enetr the character");
num4=cc.next().charAt(0);
System.out.println("Number is = "+num4);
String num5;
Scanner st=new Scanner(System.in);
System.out.println("Enetr the string");
num5=st.next();
System.out.println("Number is = "+num5);


}
}