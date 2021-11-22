package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelExample {
	
	@Test
	public void readFromExcel() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		String text = workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		System.out.println(text);
	}

}
