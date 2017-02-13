package top.hxiao.entity;

/**
 * Created by ylxs90 on 2017/2/13.
 */
public enum Position {
    东, 南, 西, 北;

    public Position next() {
        int index = (this.ordinal() + 1) % 4;
        Position temp = null;
        for (Position p : values()) {
            if (p.ordinal() == index) {
                temp = p;
            }
        }
        return temp;
    }
}
