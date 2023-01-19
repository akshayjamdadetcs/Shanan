package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a1 {
public static void main(String[] args) throws Throwable {
	//create object of FileInputStream class
	FileInputStream file=new FileInputStream("C:\\Users\\practice\\prameterization.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}
	
	
	
}
