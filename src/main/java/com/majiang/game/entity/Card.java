package com.majiang.game.entity;

/**
 * Created by hxiao on 16/8/14.
 */
public class Card {
    public final int number;
    public final CardType type;

    public Card(int number, CardType type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public String toString() {
        if(type.ordinal() <= CardType.bing.ordinal()) {
            return type.toString() + ":" + number;
        }
       return type.toString();
    }
}
