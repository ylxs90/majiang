package top.hxiao.entity;

/**
 * Created by hxiao on 16/8/14.
 */
public enum CardType {

    萬(true), 条(true), 饼(true), 東, 南, 西, 北, 中, 發, 白;
    boolean requireNumber;

    CardType(boolean requireNumber) {
        this.requireNumber = requireNumber;
    }

    CardType() {
        this(false);
    }

    public boolean isRequireNumber() {
        return requireNumber;
    }
}
