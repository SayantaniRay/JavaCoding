
public class Palindrome {

	public static void main(String[] args) {
		
		 String tr="";
		 String str="MADAM";
		 
		 
		  for (int i=str.length()-1; i>=0; i--) 
		 {
			
			 tr=tr + str.charAt(i);
			 
			 
			
		 }
		  
		  System.out.println(tr); 
		
		if(tr==str)
		{
			
			System.out.println("both the string are same");
			
				
		}
		
		
		// TODO Auto-generated method stub

	}

}
