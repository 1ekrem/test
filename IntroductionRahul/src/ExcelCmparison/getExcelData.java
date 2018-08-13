package ExcelCmparison;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class getExcelData {

	public static void main(String[] args) throws Exception {

		// 1. Define Object
		File src = new File("C:\\Users\\DELL\\Desktop\\SeleniumExcel\\ExcelReader.xlsx");

		FileInputStream fis = new FileInputStream(src);

		// 3. Workbook will be downloaded by the XSSFWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// 4. Give a meaningful name now as sheet1
		XSSFSheet sheet1 = wb.getSheetAt(0);

		// 5. Now check how many rows do you have
		int rowcount = sheet1.getPhysicalNumberOfRows(); // .getLastRowNum();

	//	System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {

			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();

			System.out.println(data0);

		}

		wb.close();
	}
}