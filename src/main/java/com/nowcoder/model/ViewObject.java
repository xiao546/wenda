package com.nowcoder.model;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * Created by 546 on 2017/5/15.
 */
public class ViewObject {
    private Map<String,Object> objs=new HashedMap();

    public void set(String key,Object obj){
        objs.put(key,obj);
    }

    public Object get(String key){
        return objs.get(key);
    }
}
