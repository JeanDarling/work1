package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author: ZHX
 * @date: 2021/1/20 20:22
 * @description:
 */
public interface UserService {
    /**
     * @description:注册用户
     * @author: ZHX
     * @date: 2021/1/20
     * @param null:
     * @return:
     */
    boolean regist(User user);
}
