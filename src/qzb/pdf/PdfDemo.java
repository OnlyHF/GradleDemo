package qzb.pdf;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * PDF Demo
 * 生成PDF文件
 */
public class PdfDemo {

    public static void main(String[] args) {
        createPDF();
    }

    /**
     * 生成PDF
     */
    private static void createPDF() {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        PdfWriter pdfWriter = null;

        try {
            FileOutputStream fos = new FileOutputStream("src/main/resources/pdf/demo.pdf");
            pdfWriter = PdfWriter.getInstance(document, fos);
            document.open();
            Font font = FontFactory.getFont("simhei.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            document.add(new Paragraph("Hello World!!!", font));
            document.add(new Paragraph("Hello 钱竹兵", font));
            System.out.println("over!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
            if (pdfWriter != null) {
                pdfWriter.close();
            }
        }


        document.open();

        document.close();
    }
}
