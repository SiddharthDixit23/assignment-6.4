import java.util.Arrays;
import java.util.*;
class Searchh
{
	int flag;
	int[] arr=new int[6];
	Scanner obj = new Scanner(System.in);
	void input()
	{
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter "+(i+1)+" value: ");
		arr[i]=obj.nextInt();
	}
	}
	
	void find()
	{
		int c=0;
		System.out.println("Enter the integer to be searched.");
		int num = obj.nextInt();
		for( int j = 0; j<arr.length ; j++)
		{
			if( num == arr[j])
			{
				flag = 1;
				c = j;
				break;
			}
			
		}
		if( flag == 1)
		{
			System.out.println("Number found at index position of "+c);
			
		}
			else
			System.out.println("Not found.");
		
	}
}	


class Array
{
	public static void main(String[] args)
	
	{
		Searchh s = new Searchh();
		s.input();
		s.find();
		
	}
}



















