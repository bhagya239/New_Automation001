package utilitypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
static	Workbook workbook;
	// return tyoe List<Map<String, Object>> 
	
	public  static void exceldata() throws IOException
	{
		
	String excelfile= "D:\\Orangedata.xlsx";
	FileInputStream input= new FileInputStream(excelfile);
	
	String extension= excelfile.substring(excelfile.indexOf("."));
	
	if(extension.equals(".xlsx"))
		workbook= new XSSFWorkbook(input);
	
	else if(extension.equals(".xlx"))
		workbook= new HSSFWorkbook(input);
	
	Sheet sheet= workbook.getSheetAt(0);

	Row row = sheet.getRow(0);
	
	int totalRows= sheet.getLastRowNum();
	int totalCols = row.getPhysicalNumberOfCells();
	System.out.println("total rows: "+totalRows+ ", total columns : "+ totalCols);

	List<Map<String, Object>> excelData=new ArrayList<>();
	
	
	for(int i=1; i<=totalRows;i++) {
		Map<String,Object> dataMap=new HashMap<>();
		for(int j=0; j<=totalCols-1;j++){
						
			Cell cell=sheet.getRow(i).getCell(j);
			
			if(j==0) {
				
				dataMap.put("username", cell.getStringCellValue());
			}else {
				dataMap.put("password", cell.getStringCellValue());
		
			}
		}
		excelData.add(dataMap);
		
	}
	
	

	//}
	
	  excelData.forEach(val->{
		System.out.print("username: "+val.get("username")+  " "); 
		System.out.print("password: "+ val.get("password"));
	  System.out.println(); 
	  
	  });
	  
	  
	  
	  
	  //System.out.println("total rows :"+sheet.getPhysicalNumberOfRows());
	  Map<Object, Object> map= new HashMap<>();
	  
	  ArrayList<Map<Object, Object>> al= new ArrayList<>();
	  
	  String uname=null;String password=null; 
	  for (int i=0; i<=totalRows;i++) 
	  {
		  row=sheet.getRow(i); 
		  for(int j=0; j<totalCols;j++) 
		  {
			  Cell cell= row.getCell(j);
	  //System.out.print(cell.getStringCellValue()+"   "); 
			  if(j==0) 
			  { 
				  uname=cell.getStringCellValue();
			  }
	  
			  else if(j==1) 
			  { 
				  password= cell.getStringCellValue(); 
			  }
	  
	      }//inner for loop
		  map.put(uname, password);// al.add(map);
	  
	  // System.out.println(); 
		  
	  }//outer for loop
	  
	  
	  ArrayList<Object> a2= new ArrayList<>(); 
	  
	  for(int i=0; i<al.size();i++) 
	  { System.out.println(al.get(i)); }
	  
	 
	  for (Entry<Object, Object> entry : map.entrySet()) 
	  {
	  System.out.println(entry.getKey()+"--*--"+entry.getValue());
	  Object ob1= entry.getKey()+"="+entry.getValue(); 
	  a2.add(ob1);
	  
	  }
	  
	  System.out.println("...MAP  collection ...");
	  System.out.println("map size : "+map.size()); System.out.println(map);
	  System.out.println("arraylist collection size :"+al.size());
	  
	  System.out.println("\n\n------ARRAY LIST OF MAP OBJECT---"); 
	  for(Object o:a2)
	  { 
		  System.out.println(o); 
	}
	  
	 
	
//System.out.println(al);
}
	
	public static void main(String[] args) throws IOException {
		
		
		ExcelUtility.exceldata();
		
	}

}
