package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;

public interface UserService {
    int findCount()throws Exception;
    User findLogin(User user) throws Exception;
    List<User> findAll(PageBean pageBean) throws Exception;
    void updateUser(User user) throws Exception;
    User findUserById(Integer id)throws Exception;
    void saveUser(User user)throws Exception;
    void deleteUser(Integer id) throws Exception;
}
