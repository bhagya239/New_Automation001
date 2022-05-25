package Excel;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void example() throws IOException
	{
	ImportExceldata imp= new ImportExceldata();
	String srcfile= "C:\\Users\\User\\Downloads\\Bhagyashri\\NewData.xlsx";
	
	ImportExceldata excel= new ImportExceldata();
	Object[][] imported= excel.getExcelData(srcfile, "Sheet2");
	
	for (int i=0; i<imported.length;i++)
	{
		for(int j=0; j<imported[i].length;j++)
		{
		 System.out.print(imported[i][j]+"  ");
		}
		
		System.out.println();
	}
	

	
}
	
	
	@Test
	public void ex2()
	{
	ArrayList al= new ArrayList();
	al.add(100);
	al.add(false);
	al.add('B');
	al.add("cyber");
	
	
	//Lambda Expression 
		al.forEach(val->{
		
			System.out.println(val);
		});
		
	}
	
}
