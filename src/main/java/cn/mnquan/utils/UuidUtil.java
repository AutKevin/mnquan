package cn.mnquan.utils;

import java.util.UUID;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/20
 */
public class UuidUtil {
    public static String getUuid(){
        return UUID.randomUUID().toString();
    }
}
