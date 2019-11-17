
//find minimum number of the given matrix

public class MinMaxInMatrix {

	public static void main(String[] args) {
		
		int min=0;
		int max=0;
		int mincloumnValue=0; 
		int a[][]= {{5,3,2},{6,7,4},{1,0,8}};
		
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				
			if(a[i][j]<min)	
				
				min=a[i][j];
			mincloumnValue=j;
			
			
			}
			
		
			
		}
		
		
		
		//find the maximum number of the same column where minimum number has found 
		
		for(int i=0;i<2;i++)
		{
		// TODO Auto-generated method stub

              if(a[i][mincloumnValue]>max)	
				
		
            	  max=a[i][mincloumnValue];
              
		}
		
		System.out.println("the minimum number of the matrix is" + " " + min);
		
		System.out.println("the maximum number of the column is " +  " " + max);
	}

}
