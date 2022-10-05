package mavenproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingWritingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\syedf\\OneDrive\\Desktop\\Faraz\\Test Automation\\Framework\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet xs=wb.getSheet("Employee_Data");
		XSSFRow row1=xs.getRow(1);
		XSSFCell col1=row1.getCell(5);
		String address=col1.getStringCellValue();
		System.out.println("Address is"+address);
		XSSFRow row=xs.getRow(0);
		int colnum=row.getLastCellNum();
		System.out.println("Total number of columns:"+colnum);
		int rownum=xs.getLastRowNum();
		System.out.println("Total number of rows excluding the header:"+rownum);
		int rownum1=xs.getPhysicalNumberOfRows();
		System.out.println("Total number of rows including the header:"+rownum1);
		XSSFCell col=row.createCell(6);
		col.setCellValue("Location");
		
		
//		XSSFSheet xs1=wb.createSheet("Student_Data");
//		XSSFRow row0=xs1.getRow(0);
//		XSSFCell col0=row0.getCell(0);
//		col0.setCellValue("First Name");
//		
//		XSSFRow newrow=xs1.getRow(10);
//		XSSFCell colrow=newrow.createCell(9);
//		colrow.setCellValue("First Name");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\syedf\\OneDrive\\Desktop\\Faraz\\Test Automation\\Framework\\TestData.xlsx");
		wb.write(fos);
		fos.close();
	}

}
