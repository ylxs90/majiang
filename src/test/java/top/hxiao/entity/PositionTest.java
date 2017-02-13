package top.hxiao.entity;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ylxs90 on 2017/2/13.
 */
public class PositionTest {

    @Test
    public void testNext() {
        Assert.assertEquals(Position.南, Position.东.next());
        Assert.assertEquals(Position.东, Position.北.next());
    }


}