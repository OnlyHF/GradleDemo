package qzb.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileOutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

public class TestVelocity {

    public static void main(String[] args) {
//        createDemo();

        String filepath = "src/main/resources/pdf/helloVm.pdf";
        try {
            createPdf(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createPdf(String file) throws Exception {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        String value = createDemo();
        Reader reader = new StringReader(value);
        XMLWorkerHelper.getInstance().parseXHtml(writer, document, reader);
        document.close();
    }

    public static String createDemo() {
        // 初始化并获取Velocity引擎
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        // 获取Velocity模板
        Template template = ve.getTemplate("src/main/resources/vm/hello.vm", "UTF-8");

        // 获取Velocity上下文
        VelocityContext context = new VelocityContext();

        // 填充数据
        context.put("name", "qianzb");
        context.put("date", (new Date()).toString());

        StringWriter writer = new StringWriter();

        // 将数据填充到模板
        template.merge(context, writer);

        String out = writer.toString();

        System.out.println(out);
        return out;

    }


}
