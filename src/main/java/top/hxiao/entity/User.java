package top.hxiao.entity;

import io.netty.channel.Channel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by ylxs90 on 2017/2/13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"username", "position", "score"})
public class User {
    private String username;
    private Position position;
    private Channel channel;
    private Long score;
    private List<Card> cards;


}
