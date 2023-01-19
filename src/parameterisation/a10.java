package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a10 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\New Microsoft Office Excel Worksheet.xlsx");
	boolean src=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
	System.out.println(src);
}
}
