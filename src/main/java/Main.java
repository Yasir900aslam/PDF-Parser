import Util.asciiArt;
import PDFParser.parser;
import Util.url;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        asciiArt util = new asciiArt();
        Scanner in = new Scanner(System.in);

        String choice = "no";
        int logicalYear= 2020;
        String logicalType = "mds";


        System.out.println("");
        //ASCII ART BITCH
        util.printTextArt("PDF PARSER", 10);

        System.out.println("");

        System.out.print("Do you want to Download-Scan [0] or Scan [1] ->");
        int userScanChoice = in.nextInt();
        if(userScanChoice== 0)
        {
            //Default Values
            System.out.println("The default Values of:");
            System.out.println("1- Logical Year = " + logicalYear);
            System.out.println("2- Logical Type = " + logicalType);
            System.out.println("Do you want to Change these values [yes / no] -> ");
            String userChoice = in.nextLine();

            if(userChoice.contentEquals("yes") || userChoice.contentEquals("Yes"))
            {
                System.out.println("1- Logical Year ->");
                logicalYear = in.nextInt();
                System.out.println("2- Logical Type ->");
                logicalType= in.nextLine();
            }
        }
        else if (userScanChoice == 1)
        {
            parser p = new parser();
            p.parsePDFTOString();
        }
        else
        {
            System.out.println("Unkown choice : Program Exiting");
            System.exit(0);
        }

    }
}
