package Util;

public class PrizeMoney {
    private String prizeType;
    private String prizeAmount;

    public PrizeMoney(String prizeType, String prizeAmount){
        this.prizeAmount=prizeAmount;
        this.prizeType=prizeType;
    }

    public String getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public String getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(String prizeAmount) {
        this.prizeAmount = prizeAmount;
    }
}
