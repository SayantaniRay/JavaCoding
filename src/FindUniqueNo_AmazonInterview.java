import java.util.ArrayList;

public class FindUniqueNo_AmazonInterview {

	public static void main(String[] args) {
		
		
	int a[]= {5,6,6,6,4,5,5,4,3,2,2,1,1};	
	
	
	ArrayList<Integer> ar=new ArrayList<Integer>();
	
	for (int i=0; i<a.length; i++)
	{
		
		int counter=0;
		
		if(!ar.contains(a[i]))
			{
			
			
			ar.add(a[i]);
			counter+=1;
			
			
		

		for (int j=i+1; j<a.length; j++)
		{
			
			if(a[i]==a[j])
			
				
				counter+=1;
			
		
		}
			
	}	
			if(counter==1)
				
				System.out.println("the unique no is " + " " + a[i]);
				
				
			
		
	}	
	
	
	}
	

}


