package com.xz.service;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TUser;
import com.xz.pojo.vo.UserInfoVo;
import com.xz.pojo.vo.UserMenuvo;

import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public interface TUserService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TUser> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    List<UserMenuvo>  queryById(Integer id);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

     TUser login(TUser user);

     PageInfo<TUser> queryUsers(int currentPage);

     int addUser(UserInfoVo userInfoVo);
}

