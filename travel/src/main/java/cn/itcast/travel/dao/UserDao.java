package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author: ZHX
 * @date: 2021/1/20 20:54
 * @description:
 */
public interface UserDao {

    //查询用户信息
    public User findByUsername(String username);

    //用户保存
    public void save(User user);

}
