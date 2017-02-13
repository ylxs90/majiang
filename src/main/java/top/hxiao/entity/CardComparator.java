package top.hxiao.entity;

import java.util.Comparator;

/**
 * Created by hxiao on 16/8/14.
 */
public class CardComparator implements Comparator<Card> {

    /**
     * 花色相同, 数字排序, 否则按花色排序
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.type == o2.type) {
            return o1.number - o2.number;
        } else {
            return o1.type.ordinal() - o2.type.ordinal();
        }
    }

}
