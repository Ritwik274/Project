import java.util.Scanner;
class ArmstrongNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int num1=num;
		int length=0; 
        int num2=num;
		int sum=0;
		while (num>0)
		{
			num=num/10;
			length++;
		}
          while (num1>0)
          {
			  int rem=num1%10;
			  int pow=1;
			  for (int i=1;i<=length ;i++ )
			  {
				  pow=pow*rem;

			  }
              sum=sum+pow;
			  num1=num1/10;
          }
		  if (sum==num2)
		  {
			  System.out.println("The num is Armstrong Number");
		  }
		  else
		{
			  System.out.println("The num is not a Armstrong Number");
		}
	}
}
