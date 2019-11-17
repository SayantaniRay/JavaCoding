
public class ArraySum {

	public static void main(String[] args) {
		
		int a[]= {4,5,3,6,7,2};
		int p=0;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
			p=p+a[i];
		}
		// TODO Auto-generated method stub
System.out.println("the sum of array is" + " " + p);


for(int i=0; i<a.length; i++)
{
	if(a[i]==6)
	
		System.out.println("the index of number 6 is " + i);
}
	}

}
