package com.assignment2;

import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfConversion extends excelRead {

    public static void convertPdf(){

        Document doc = new Document();
        try {
            PdfWriter.getInstance( doc, new FileOutputStream("Player.pdf"));
            PdfPTable table = new PdfPTable(6);

            for(int i = 0; i< data.size(); i++ ){
                table.addCell(data.get(i).getNo());
                table.addCell(data.get(i).getName());
                table.addCell(data.get(i).getFideId());
                table.addCell(data.get(i).getFED());
                table.addCell(data.get(i).getRtg());
                table.addCell(data.get(i).getCity());
            }
            doc.open();
            doc.add(table);
            doc.close();

            System.out.println("PDF file have successfully create");

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

