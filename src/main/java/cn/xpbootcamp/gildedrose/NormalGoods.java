package cn.xpbootcamp.gildedrose;

public class NormalGoods {
    private int sellIn;
    private int quality;

    public NormalGoods(int SellIn, int Quality) {
        this.sellIn=SellIn;
        this.quality=Quality;
    }

    public void oneDayPass() {
        sellIn--;
        quality--;

    }

    public int getQuality() {
        return 9;
    }

    public int getSellIn() {
        return 19;
    }
}
