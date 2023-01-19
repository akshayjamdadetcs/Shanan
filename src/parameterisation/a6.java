package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a6 {
public static void main(String[] args) throws Throwable {
FileInputStream	file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\Copy of prameterization 1.xlsx");
boolean src = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(4).getBooleanCellValue();
System.out.println(src);
}
}
