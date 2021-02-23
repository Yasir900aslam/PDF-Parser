package Util;

import com.google.gson.annotations.Expose;

public class Footer {
        @Expose
        private MetaData meta;
        @Expose
        private PrizeMoney prize;
        @Expose
        private SeededPlayer seed;
        @Expose
        private Alternate alter;
        @Expose
        private Withdrawls withdrawls;


     public Footer(MetaData meta, PrizeMoney prize, SeededPlayer seed, Alternate alter, Withdrawls withdrawls){
        this.alter=alter;
        this.meta=meta;
        this.prize=prize;
        this.seed=seed;
        this.withdrawls=withdrawls;
    }

    public MetaData getMeta() {
        return meta;
    }

    public void setMeta(MetaData meta) {
        this.meta = meta;
    }

    public PrizeMoney getPrize() {
        return prize;
    }

    public void setPrize(PrizeMoney prize) {
        this.prize = prize;
    }

    public SeededPlayer getSeed() {
        return seed;
    }

    public void setSeed(SeededPlayer seed) {
        this.seed = seed;
    }

    public Alternate getAlter() {
        return alter;
    }

    public void setAlter(Alternate alter) {
        this.alter = alter;
    }

    public Withdrawls getWithdrawls() {
        return withdrawls;
    }

    public void setWithdrawls(Withdrawls withdrawls) {
        this.withdrawls = withdrawls;
    }
}
