package Helpers;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {

	public static HashMap<String, String> objData;
	public static XSSFWorkbook WBook;
	public static XSSFSheet WSheet;
	public static XSSFRow Row;
	public static XSSFCell cell;
	public static String Currenttest;
	public ArrayList<String> TCiDs;


	public void LoadData() throws Exception {
		
//		String DirPath  = System.getProperty("user.dir");
//		String testDataFile = DirPath +"\\TestData\\HOW_Are_You_Data.xlsx";
		
		String testDataFile = "C:\\Users\\ukadiyala\\Documents\\HAT_TestResults\\HOW_Data.xlsx";
		System.out.println("Test data file - "+testDataFile);
		//File src = new File(testDataFile)

		File src = new File(testDataFile);
		FileInputStream fis = new FileInputStream(src);
		WBook = new XSSFWorkbook(fis);
		WSheet = WBook.getSheet("TestData");
		int rowCount = WSheet.getPhysicalNumberOfRows();
		System.out.println("Row Count - " + rowCount);
		TCiDs = new ArrayList<String>();

		for (int rCnt = 1; rCnt < rowCount; rCnt++) {			
			String sTC = getCellData("TestData", rCnt, 1);
			//System.out.println("testcase - " + sTC);
			String sExecution = getCellData("TestData", rCnt, 0);
			//System.out.println("testexecution - " + sExecution);
			if(sExecution.trim().toUpperCase().equals("Y")) {
				TCiDs.add(sTC);
			}
		}
		 //System.out.println(CompletData);
		 //System.out.println("TC2 execute - "+CompletData.get("TC1").get("Execute"));
	}
	
	public HashMap<String, String> loadTestCaseData(String TestCase) {
		objData = new HashMap<String, String>();
		String sHeader;
		String sValue;
		int rwcnt = WSheet.getPhysicalNumberOfRows();
		int colCount = WSheet.getRow(0).getPhysicalNumberOfCells();
		
		
		
		for (int r = 1; r < rwcnt; r++) {
			if(getCellData("TestData", r, 1).equals(TestCase)) {
				
				objData.clear();
				
				for (int cCnt = 0; cCnt < colCount; cCnt++) {
				sHeader = getCellData("TestData", 0, cCnt);
				sValue = getCellData("TestData", r, cCnt);
				//System.out.println("header - "+sHeader+" value - "+sValue);
				objData.put(sHeader, sValue);
				}	
				
				
				break;
				
			}
		}
		return objData;
		
		
		
		
		
		
		
		
	}
	
	

	public static String getCellData(String Sheet, int row, int col) {

		try {
			int index = WBook.getSheetIndex(Sheet);
			WSheet = WBook.getSheetAt(index);
			Row = WSheet.getRow(row);
			if (Row == null)
				return "";
			cell = Row.getCell(col);
			if (cell == null)
				return "";

			cell.getCellType();

			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();

			case Cell.CELL_TYPE_NUMERIC:
				return String.valueOf((int) cell.getNumericCellValue());

			case Cell.CELL_TYPE_BLANK:
				return "";

			case Cell.CELL_TYPE_BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());

			default:
				return "Cell not found";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return "row " + row + " or column " + col + " does not exist in xls";
		}
	}
	


}
