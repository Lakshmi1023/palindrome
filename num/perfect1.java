import java.util.Scanner;
class perfect1 
{
	static Scanner s=new Scanner(System.in);
	static String res="not perfect";
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int given=s.nextInt();
		int sum=0;
		for(int i=1;i<given;i++)
		{
			if(given%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==given)
		{
		    res="perfect";
          System.out.println("the given "+given+" is :"+res);
		}
		else

       System.out.println("the given "+given+" is :"+res);
	}
}
