package Util;

import java.util.ArrayList;

public class Withdrawls {
    private ArrayList<String> withdraw ;

    public Withdrawls(ArrayList<String> withdraw){
            this.withdraw = withdraw;
    }

    public ArrayList<String> getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(ArrayList<String> withdraw) {
        this.withdraw = withdraw;
    }
}
