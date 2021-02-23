package PDFParser;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class parser {

    public void parsePDFTOString() throws IOException {
    File file = new File("src/main/java/mdd.pdf");
    PDDocument document = PDDocument.load(file);
    //Instantiate PDFTextStripper class
    PDFTextStripper pdfStripper = new PDFTextStripper();
    //Retrieving text from PDF document
    String text = pdfStripper.getText(document);
    System.out.println(text);
    }
}
