package Util;

public class MetaData {

    private String Year;
    private String type;
    private String url;

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    MetaData(String type, String year, String url){
    this.url = url;
    this.type = type;
    this.Year= year;
    }


}
