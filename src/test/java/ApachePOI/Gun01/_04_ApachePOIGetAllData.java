package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) {

        String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";

        Workbook workbook;
        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet= workbook.getSheet("Sheet1");

        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowCount ; i++) {

            Row row= sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();

            for (int j = 0; j <cellCount ; j++) {

                Cell cell=row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();
        }


    }
}
