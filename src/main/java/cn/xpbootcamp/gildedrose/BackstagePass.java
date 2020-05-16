package cn.xpbootcamp.gildedrose;

public class BackstagePass {
    private int sellIn;
    private int quality;

    public BackstagePass(int sellIn, int quality) {
        this.sellIn=sellIn;
        this.quality=quality;
    }

    public void oneDayPass() {
        if (sellIn >10)
            quality++;
        else if (sellIn <=5)
            quality +=3;
        else if (sellIn <= 10)
            quality +=2;

        sellIn--;
        quality=Math.min(50,quality);
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
