import java.util.*;
import java.util.Scanner;
class username
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter username:");
String S1 = input.nextLine();
System.out.println("reenter username:");
String S2 = input.nextLine();
if (S1.equals(S2))
{
System.out.println("The user name is valid");
}
else
{
System.out.println("The user name is not valid");
}
}
}