package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a4 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\New Microsoft Office Excel Worksheet.xlsx");
	String src = WorkbookFactory.create(file).getSheet("sheet1").getRow(8).getCell(5).getStringCellValue();
	System.out.println(src);
}
}
