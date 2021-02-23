package Util;

public class SeededPlayer {
    private String player;
    private String rank;

    public SeededPlayer(String player, String rank){
        this.player=player;
        this.rank=rank;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
