package PDFParser;

import Util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// "src/main/java/mdd.pdf"
public class parser {

    public ArrayList<Footer> parsePDFTOString(ArrayList<String> pathname) throws IOException {
        ArrayList<Footer> footer = new ArrayList<Footer>();

        for (String p : pathname) {
            File file = new File(p);
            PDDocument document = PDDocument.load(file);
            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();
            //Retrieving text from PDF document
            String text = pdfStripper.getText(document);


            MetaData meta = new MetaData();
            PrizeMoney prize = new PrizeMoney();
            SeededPlayer seed = new SeededPlayer();
            Alternate alter = new Alternate();
            Withdrawls withdrawls = new Withdrawls();
            Footer f = new Footer(meta,prize,seed,alter,withdrawls);
            footer.add(f);
        }

        return footer;
    }
}
