package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a3 {
public static void main(String[] args) throws Throwable {
	FileInputStream str=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\Copy of prameterization 1.xlsx");
String abc = WorkbookFactory.create(str).getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
System.out.println(abc);
}
}
