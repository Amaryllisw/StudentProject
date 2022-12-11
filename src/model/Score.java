package model;

public class Score {
    private int yuwen;
    private int shuxue;
    private int yingyu;

    public Score() {}

    public Score(int yuwen, int shuxue, int yingyu) {
        this.yuwen = yuwen;
        this.shuxue = shuxue;
        this.yingyu = yingyu;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public int getYingyu() {
        return yingyu;
    }

    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

}
