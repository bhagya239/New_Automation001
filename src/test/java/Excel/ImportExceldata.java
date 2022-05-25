package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExceldata {
	
private	Workbook workbook;
private Sheet sheet;
private Row row;
private Cell cell;
	
	public void getWorkBookInstance(String srcfile) throws IOException
	{
//String srcfile= "C:\\Users\\User\\Downloads\\Bhagyashri\\NewData.xlsx";
	
FileInputStream input= new FileInputStream(srcfile);
	
String extension= srcfile.substring(srcfile.indexOf("."));
	if(extension.equals(".xlsx"))
		workbook = new XSSFWorkbook(input);
	
	else if(extension.equals(".xlx"))
		workbook = new HSSFWorkbook(input);

	}
	
	public Object[][] getExcelData(String filepath, String name) throws IOException {
		
		getWorkBookInstance(filepath);
	 sheet= workbook.getSheet(name);
	  row= sheet.getRow(0);
	int totalrows= sheet.getPhysicalNumberOfRows();
	int totalcols= row.getPhysicalNumberOfCells();
	Object[][] obj= new Object[totalrows][totalcols];
	for (int i=0; i<totalrows;i++)
	{
		for(int j=0; j<obj[i].length;j++)
		{
		 cell=sheet.getRow(i).getCell(j);
		 obj[i][j]=cell;
		}
	}
	
	return obj;
	
	}
	
//	public static void main(String[] args) throws IOException {
//		ImportExceldata imp= new ImportExceldata();
//		String srcfile= "C:\\Users\\User\\Downloads\\Bhagyashri\\NewData.xlsx";
//		Object[][] imported= imp.getExcelData(srcfile, "Sheet2");
//		
//		for (int i=0; i<imported.length;i++)
//		{
//			for(int j=0; j<imported[i].length;j++)
//			{
//			 System.out.print(imported[i][j]+"  ");
//			}
//			
//			System.out.println();
//		}
//		
//		
//	}

		

}
