package com.nowcoder.async;

import java.util.List;

/**
 * Created by 546 on 2017/5/18.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
