package test;

import org.junit.Test;
import top.hxiao.entity.Card;
import top.hxiao.entity.CardType;

/**
 * Created by hxiao on 16/8/14.
 */
public class TestGame {

    @Test
    public void testEntity() {
        System.out.println(new Card(9, CardType.萬));
    }
}
