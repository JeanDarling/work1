package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

/**
 * @author: ZHX
 * @date: 2021/1/20 20:23
 * @description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userdao=new UserDaoImpl();

    @Override
    public boolean regist(User user) {
        User byUsername = userdao.findByUsername(user.getUsername());
        if(byUsername!=null){
            //用户名存在，注册失败
            return false;
        }

        //用户名不存在
        //保存用户信息
        userdao.save(user);
        return true;
    }
}
