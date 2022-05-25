package testNG_pack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvision {
	
	
	@Test(dataProvider ="mydata")
	public void sample(Object ob1, Object ob2, Object ob3, Object ob4,Object ob5)
	{
		
		System.out.println(ob1+" "+ob2+" "+ob3+" "+ob4+" "+ob5);
		
	}
	 
	
	
	@DataProvider(name = "mydata")
	public Object[][] data()
	{
		Object[][] obj= new Object[3][5];
		char ch='A';
		
		for(int i=0; i<obj.length;i++)
		{
			
			for(int j=0; j<obj[i].length;j++)
			{
				obj[i][j]= ch;
			//	System.out.print(obj[i][j]+" ");
				ch++;
				
			}
		//	System.out.println();
		}
		
		return obj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
