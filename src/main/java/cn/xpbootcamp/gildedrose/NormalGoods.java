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
        quality=Math.max(0, quality);
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
