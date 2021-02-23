package scan;

import PDFParser.parser;
import Util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class scanparser  {
    public ArrayList<Footer> parsePDFTOString(String name) throws IOException {
        ArrayList<Footer> footer = new ArrayList<>();
        File file = new File(name);
        PDDocument document = PDDocument.load(file);
        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();
        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);
        text = text.substring(text.length()/2, text.length() -1);
        String[] res = text.split("[, .]", 0);
        ArrayList<String> alterl = new ArrayList<String>();
        for (String s: res)
        {
            MetaData meta = new MetaData(s,s,s);
            PrizeMoney prize = new PrizeMoney(s,s);
            SeededPlayer seed = new SeededPlayer(s,s);
            alterl.add(s);
            Alternate alter = new Alternate(alterl);
            Withdrawls withdrawls = new Withdrawls(alterl);
            Footer f = new Footer(meta,prize,seed,alter,withdrawls);
            footer.add(f);
        }
        return footer;
    }


}
