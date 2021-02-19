package Util;

import java.util.ArrayList;

public class url {
    private int logicalYear;
    private String logicalType;


    //step 1: http://www.protennislive.com/posting/2020/398/mdd.pdf
    //http://wtafiles.wtatennis.com/pdf/draws/2021/2032/MDS.pdf


    private String protienislive;
    private String wtafile;
    private final String baseProton = "http://www.protennislive.com/posting/";
    private final String wta = "http://wtafiles.wtatennis.com/pdf/draws/";

    private ArrayList<String> url;

    url(int logicalYear, String logicalType){
        this.logicalType = logicalType;
        this.logicalYear = logicalYear;
        this.composeUrl();
    }

    private void composeUrl(){


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
        return url;
    }

    public void setUrl(ArrayList<String> url) {
        this.url = url;
    }




}
