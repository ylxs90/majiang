package top.hxiao.game;

import lombok.Data;
import top.hxiao.entity.Card;
import top.hxiao.entity.CardType;
import top.hxiao.entity.User;

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
    private List<User> users = new LinkedList<>();
    private User host;
    private volatile static Table instance = null;


    public static Table getInstance() {
        if (instance == null) {
            synchronized (Table.class) {
                if (instance == null) {
                    instance = new Table();
                }
            }
        }
        return instance;
    }

    private Table() {
        initTable();
    }


    private void initTable() {


    }

    /**
     * 洗牌
     */
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
    }

    private void clearHeap() {
        heap = new LinkedList<>();
    }


    /**
     * 庄家赢
     */
    public void hostWin() {
    }

    /**
     * 庄家输，下一家坐庄
     */
    public void hostLost() {
    }

    public void join(User user) {
        users.add(user);
    }

    /**
     * 是否可以开始
     *
     * @return
     */
    public boolean isReady() {
        return users.size() == 4;
    }

    /**
     * 开始
     */
    public void start() {
        clearHeap();
        initCardStore();
    }


}
