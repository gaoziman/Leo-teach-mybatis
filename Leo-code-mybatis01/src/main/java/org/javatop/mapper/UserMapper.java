package org.javatop.mapper;

import org.javatop.pojo.User;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-17 21:27
 * @description : mapper文件
 */

public interface UserMapper {


    /**
     * 查询所有用户信息
     * @return
     */
     List<User> selectUserList();
}
