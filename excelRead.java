package com.assignment2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class excelRead {

    public static ArrayList<playerAccess> data = new ArrayList<playerAccess>();
    private static String excel = "C:\\Users\\User\\Desktop\\Assignment 2 - real time\\Book1.xlsx";

    public static void collectData() {
        try {
            System.out.println("Collect the data..");
            FileInputStream file = new FileInputStream(new File(excel));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Cell a = row.getCell(0);
                Cell b = row.getCell(2);
                Cell c = row.getCell(3);
                Cell d = row.getCell(4);
                Cell e = row.getCell(5);
                Cell f = row.getCell(6);

                String h = String.valueOf(a);
                String i = String.valueOf(b);
                String j = String.valueOf(c);
                String k = String.valueOf(d);
                String l = String.valueOf(e);
                String m = String.valueOf(f);

                data.add(new playerAccess(h,i,j,k,l,m));
                 }
                    for(playerAccess data : data) {
                        System.out.println(data.getNo() +"   :   "
                                 + data.getName()+"   :    " + data.getFideId() +"   :   "
                                 + data.getFED()+"   :   " + data.getRtg() +"   :   "
                                 + data.getCity());
                    }
            System.out.println("Data successfully collect");

                } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}




