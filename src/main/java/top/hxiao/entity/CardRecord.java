package top.hxiao.entity;

/**
 * Created by ylxs90 on 2017/2/13.
 */
public class CardRecord {

    public final Card card;
    public final String user;

    public CardRecord(Card card, String user) {
        this.card = card;
        this.user = user;
    }

    public static CardRecord build(Card card, String user) {
        return new CardRecord(card, user);
    }
}
