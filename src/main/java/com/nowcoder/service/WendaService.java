package com.nowcoder.service;

import org.springframework.stereotype.Service;

/**
 * Created by 546 on 2017/5/14.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
