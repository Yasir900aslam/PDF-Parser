package Util;

import java.time.LocalDate;
import java.util.ArrayList;

public class url {
    private int logicalYear;
    private String logicalType;


    public url(int logicalYear, String logicalType){
        this.logicalType = logicalType;
        this.logicalYear = logicalYear;
        this.composeUrl();
    }
    //step 1: http://www.protennislive.com/posting/2020/398/mdd.pdf
    //http://wtafiles.wtatennis.com/pdf/draws/2021/2032/MDS.pdf


    private String protienislive;
    private String wtafile;
    private final String baseProton = "http://www.protennislive.com/posting/";
    private final String wta = "http://wtafiles.wtatennis.com/pdf/draws/";

    private ArrayList<String> url_proton;
    private ArrayList<String> url_wta;

    private void composeUrl(){
        url_proton = new ArrayList<String>();
        url_wta = new ArrayList<String>();
        String bufproton;
        String bufwta;
        LocalDate currentdate = LocalDate.now();
        for( int i =100; i <=400; i++)
        {
            bufproton = baseProton + logicalYear + "/"+ i+"/"+logicalType +"/";
            bufwta = wta + logicalYear + "/"+ (logicalYear+10) +"/"+logicalType +"/";
            url_proton.add(bufproton);
            url_wta.add(bufwta);
        }
    }

    public int getLogicalYear() {
        return logicalYear;
    }

    public void setLogicalYear(int logicalYear) {
        this.logicalYear = logicalYear;
    }

    public String getLogicalType() {
        return logicalType;
    }

    public void setLogicalType(String logicalType) {
        this.logicalType = logicalType;
    }

    public ArrayList<String> getUrl() {
        return url_proton;
    }

    public void setUrl(ArrayList<String> url) {
        this.url_proton = url;
    }


    public ArrayList<String> getUrl_wta() {
        return url_wta;
    }

    public void setUrl_wta(ArrayList<String> url_wta) {
        this.url_wta = url_wta;
    }
}
