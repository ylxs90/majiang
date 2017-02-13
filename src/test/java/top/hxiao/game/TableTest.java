package top.hxiao.game;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ylxs90 on 2017/2/13.
 */
public class TableTest {
    Table table;

    @Before
    public void init() {
        table = new Table();
    }

    @Test
    public void testCardNumber() {
        Assert.assertEquals(136, table.getCardStore().size());
        System.out.println(table.getCardStore());
    }


}