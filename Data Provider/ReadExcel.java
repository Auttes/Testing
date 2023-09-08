package Email.java;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel
{
    public static String[][] readData() throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook("./dataa/username.xlsx");
        XSSFSheet sheet=  wb.getSheetAt(0);
        int lr=sheet.getLastRowNum();
        int lc=sheet.getRow(0).getLastCellNum();
        String data[][]=new String[lr][lc];
        for(int i =1;i<=lr;i++)
        {
            XSSFRow R=sheet.getRow(i);
            {
                for(int j=0;j<lc;j++)
                {
                    String cv= R.getCell(j).getStringCellValue();
                   // System.out.println(cv);
                    data[i-1][j]=cv;
                }
            }
        }
        wb.close();
        return data;
    }
}
