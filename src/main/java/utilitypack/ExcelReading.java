package utilitypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	
	public static  Object[][] excelControl() throws IOException
	{
		
		String srcfile= "C:\\Users\\User\\Downloads\\Bhagyashri\\NewData.xlsx";	
		FileInputStream file= new FileInputStream(srcfile);
		
		String chkExt= srcfile.substring(srcfile.indexOf("."));
		Workbook workbook=null;
		if(chkExt.equals(".xlsx"))
			{
			 workbook= new XSSFWorkbook(file);
			 
			}
		else if(chkExt.equals(".xlx"))
		{
		 workbook= new HSSFWorkbook(file);
		}
	
	Sheet sheet = workbook.getSheetAt(0);
	
int rows= sheet.getPhysicalNumberOfRows();
int cols= sheet.getRow(0).getPhysicalNumberOfCells();
//System.out.println("total rows : "+rows+", totalcols :  "+cols);
Object[][] object= new Object[rows][cols];

for(int i=1; i<rows;i++)
{
	for(int j=0; j<cols;j++)
	{
		Cell cell= sheet.getRow(i).getCell(j);
		object[i][j]= cell;
	}

}
return object;

}//method 

	public static void main(String[] args) throws IOException {
	
	Object[][] newob= excelControl();
	System.out.println("newob size : "+newob.length);
	
	for(int i=0; i<newob.length;i++)
	{
		for(int j=0; j<newob[i].length;j++)
		{
			System.out.print(newob[i][j]+"  ");
		}
	
		System.out.println();
	}//outer
	
	}//main
}//class
