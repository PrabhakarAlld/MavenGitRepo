package trainingselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	private FileInputStream file;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFCell cell;
	private XSSFRow roww;
	private DataFormatter formatter;

	public void setExcel(String path, String sheetname ) throws IOException
	{
		file= new FileInputStream (path);
		workbook= new XSSFWorkbook(file);
		sheet =workbook.getSheet(sheetname);
	}
	public String getCellvalue(int row, int col)
	{
		cell=sheet.getRow(row).getCell(col);
		return cell.getStringCellValue();
	}
	public String getCellvalue1(int row, int col)
	{
		cell=sheet.getRow(row).getCell(col);
		formatter= new DataFormatter();
		return formatter.formatCellValue(cell);
	}

	/*public String getrow(int row)
	{
		row= sheet.getRow(row);
		formatter= new DataFormatter();
		return formatter.formatCellValue(row);
	}*/

	public int getTotalNumberOfRows()
	{
		Iterator<Row> rowIterator = sheet.iterator();
		int counter = 0;
		while(rowIterator.hasNext()){

			counter++;

		}
		return counter;
		/*formatter= new DataFormatter();
		return formatter.formatCellValue(cell);*/
	}
	public int getTotalNumberOfRows1(){

		Iterator rows = sheet.rowIterator(); 
		int counter = 0;
		while(rows.hasNext()){
			XSSFRow row = (XSSFRow) rows.next();

			counter++;

		}
		return counter;
	}
	public int getTotalNumberOfColumn(){

		Iterator rows = sheet.rowIterator(); 
		int rowcount = 0;
		while(rows.hasNext()){
			XSSFRow row = (XSSFRow) rows.next();

			Iterator<Cell> cellIterator = row.cellIterator();
			
			while (cellIterator.hasNext()) 
            {
				rowcount++;
                Cell cell = cellIterator.next();
                //rowcount++;
            }
			

		}
		return rowcount;
	}


}




