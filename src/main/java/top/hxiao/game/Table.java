package top.hxiao.game;

import lombok.Data;
import top.hxiao.entity.Card;
import top.hxiao.entity.CardType;
import top.hxiao.entity.Position;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ylxs90 on 2017/2/13.
 */
@Data
public class Table {
    private Queue<Card> cardStore;
    private Queue<Card> heap;
    private Position host;

    public Table() {
        initTable();
    }

    private void initTable() {
        initPosition();
        clearHeap();
        initCardStore();

    }

    private void initCardStore() {
        cardStore = new LinkedList<>();

        for (int time = 0; time < 4; time++) {
            for (CardType type : CardType.values()) {
                if (type.isRequireNumber()) {
                    for (int i = 1; i < 10; i++) {
                        cardStore.add(Card.build(i, type));
                    }
                } else {
                    cardStore.add(Card.build(type));
                }
            }
        }

        Collections.shuffle((List) cardStore);
    }

    private void clearHeap() {
        heap = new LinkedList<>();
    }

    private void initPosition() {
        host = Position.东;
    }


}
