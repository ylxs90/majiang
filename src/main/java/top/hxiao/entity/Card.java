package top.hxiao.entity;

/**
 * Created by hxiao on 16/8/14.
 */
public class Card {
    public final int number;
    public final CardType type;

    public Card(int number, CardType type) {
        if (type.isRequireNumber() && (number < 1 || number > 9)) {
            throw new IllegalArgumentException("number must in 1..9");
        }
        this.number = number;
        this.type = type;
    }

    public Card(CardType type) {
        this(0, type);
        if (type.isRequireNumber()) {
            throw new IllegalArgumentException("wan, tiao, bing must input a number");
        }
    }


    public static Card build(int number, CardType type) {
        return new Card(number, type);
    }

    public static Card build(CardType type, int number) {
        return new Card(number, type);
    }

    public static Card build(CardType type) {
        return new Card(type);
    }

    @Override
    public String toString() {
        if (type.isRequireNumber()) {
            return number + type.toString();
        }
        return type.toString();
    }
}
