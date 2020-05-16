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
        if (sellIn > 0)
            quality--;
        else
            quality-=2;
        quality=Math.max(0, quality);
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
