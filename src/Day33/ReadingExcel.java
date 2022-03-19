package Day33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			FileInputStream file = new FileInputStream("/Users/admin/Downloads/data.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheet = workBook.getSheet("Sheet1");
			
			int totalNumRows = sheet.getLastRowNum();
			int totalCell = sheet.getRow(1).getLastCellNum();
			
			System.out.println("Rows "+ totalNumRows);
			System.out.println("Coloumn "+ totalCell);
			
			for(int r =0; r <= totalNumRows; r++ ) {
				
				XSSFRow currentRow = sheet.getRow(r);
				
				for(int c=0; c< totalCell; c++) {
					XSSFCell cell = currentRow.getCell(c);
					System.out.println(cell.toString()+"    ");
				}
				System.out.println();
			}
			workBook.close();
			file.close();
			
			
			
	}

}

