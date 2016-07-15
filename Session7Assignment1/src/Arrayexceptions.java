
public class Arrayexceptions {
public static void main(String args[])
{
	int arr[]=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	System.out.println("The array values");
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println();
	try{
		System.out.println("In try block");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	catch(Exception exp)
	{
		System.out.println("Trying to access value of the array outside its limit");
	}
}
}
