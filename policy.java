import java.util.Scanner;

public class policy{

public static void main (String[] args){

Scanner scanner = new Scanner (System.in);

int policyNumber=0;
String insuranceCompany;
String clientFirst;
String clientLast;
int clientAge;
String smokingStatus;
double height;
double weight;
double bmi;

System.out.print("Please enter the policy number:");
policyNumber= scanner.nextInt();

System.out.println("Please enter the provider name:");
insuranceCompany= scanner.nextLine();

System.out.print("Please enter the Policyholder's first name:");
clientFirst = scanner.nextLine();

System.out.print("Please enter the Policyholder's last name:");
clientLast = scanner.nextLine();

System.out.print("Please enter the Policyholder's age:");
clientAge = scanner.nextInt();

System.out.println("Please enter the policyholder's smoking status(smoker/non-smoker):");
smokingStatus = scanner.nextLine();

System.out.print("Please enter the Policyholder's Height(in inches):");
height= scanner.nextDouble();

System.out.print("Please enter the Policyholders weight (in pounds):");
weight = scanner.nextDouble();




}
public static double bmi(double height, double weight){
double BMI;
return BMI=(weight * 703)/(height)*(height);
}
public static double policyprice();
{
double baseFee=600

if (age>50)
{
newPrice = baseFee + 75;
}
else if (smokingStatus == true)
{
newPrice = baseFee + 100;
}
else
{ 
new price = (BMI - 35) * 20;
}

}
}
