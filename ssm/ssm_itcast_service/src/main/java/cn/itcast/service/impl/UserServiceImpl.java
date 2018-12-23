package cn.itcast.service.impl;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int findCount() throws Exception {
        return userMapper.findCount();
    }

    public User findLogin(User user) throws Exception {
        return userMapper.findLogin(user);
    }

    public List<User> findAll(PageBean pageBean) throws Exception{

        pageBean.setStartNum((pageBean.getPageNum()-1)*pageBean.getCount());
        return userMapper.findAll(pageBean) ;
    }

    @Override
    public void updateUser(User user) throws Exception {
        userMapper.updateUser(user);
    }

    @Override
    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

    @Override
    public void saveUser(User user) throws Exception {
        userMapper.saveUser(user);

    }

    @Override
    public void deleteUser(Integer id) throws Exception {
        userMapper.deleteUser(id);
    }
}
