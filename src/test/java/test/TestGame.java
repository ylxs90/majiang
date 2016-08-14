package test;

import com.majiang.game.entity.Card;
import com.majiang.game.entity.CardType;
import org.junit.Test;

/**
 * Created by hxiao on 16/8/14.
 */
public class TestGame {

    @Test
    public void testEntity() {
        System.out.println(new Card(9, CardType.wan));
    }
}
