package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: ZHX
 * @date: 2021/1/20 20:55
 * @description:
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public User findByUsername(String username) {
        User user=null;
        try{
            String sql="select * from tab_user where username=?";
             user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username);


        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void save(User user) {
        String sql="insert into tab_user(username,password,name,birthday,sex,telephone,email)  values(?,?,?,?,?,?,?)";
        template.update(sql,user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getBirthday(),
                user.getSex(),
                user.getEmail());
    }
}
