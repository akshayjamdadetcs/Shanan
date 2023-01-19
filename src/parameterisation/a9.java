package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a9 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\Copy of prameterization 1.xlsx");
	String abc = WorkbookFactory.create(file).getSheet("sheet1").getRow(5).getCell(2).getStringCellValue();
	System.out.println(abc);
}
}
