package Util;

import java.util.ArrayList;

public class Alternate {
    private ArrayList<String> alternates;

    Alternate(ArrayList<String> alternates){
        this.alternates=alternates;
    }

    public ArrayList<String> getAlternates() {
        return alternates;
    }

    public void setAlternates(ArrayList<String> alternates) {
        this.alternates = alternates;
    }
}
