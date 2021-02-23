package PDFParser;

import Util.Footer;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// "src/main/java/mdd.pdf"
public class parser {

    public ArrayList<Footer> parsePDFTOString(ArrayList<String> pathname) throws IOException {
    File file = new File(pathname);
    PDDocument document = PDDocument.load(file);
    //Instantiate PDFTextStripper class
    PDFTextStripper pdfStripper = new PDFTextStripper();
    //Retrieving text from PDF document
    String text = pdfStripper.getText(document);
    System.out.println(text);
    }
}
