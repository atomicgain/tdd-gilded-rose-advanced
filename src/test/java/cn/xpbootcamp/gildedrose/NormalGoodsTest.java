package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NormalGoodsTest {

    @Test
    public void should_return_sellIn_9_quality_19_when_normal_product_pass_1_day_given_sellIn_10_quality_20(){
        NormalGoods normalGoods = new NormalGoods(10,20);
        normalGoods.oneDayPass();
        assertThat(normalGoods.getQuality()).isEqualTo(9);
        assertThat(normalGoods.getSellIn()).isEqualTo(19);

    }

}
