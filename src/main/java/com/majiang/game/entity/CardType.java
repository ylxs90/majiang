package com.majiang.game.entity;

/**
 * Created by hxiao on 16/8/14.
 */
public enum CardType {
    wan(false), tiao(false), bing(false), dong, nan, xi, bei, zhong, fa, bai;
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
