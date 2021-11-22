package dataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelSheet {

	public static void main(String rags[]) throws IOException {
		//writing excel sheet	
		//creating excel file
		File excel = new File("C:\\Users\\Admin\\Desktop\\demo.xlsx");
		
		//reading file
		FileInputStream readexcel = new FileInputStream(excel);
		//creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook(readexcel);
		XSSFSheet sheet = workbook.createSheet("demo new data");
		FileOutputStream output = new FileOutputStream(excel);
		workbook.write(output);
		workbook.close();
	}

}
