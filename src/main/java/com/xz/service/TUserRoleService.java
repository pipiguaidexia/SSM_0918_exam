package com.xz.service;

import com.xz.pojo.TUserRole;
import java.util.List;

/**
 * (TUserRole)表服务接口
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public interface TUserRoleService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TUserRole> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TUserRole queryById(Integer userId);

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole insert(TUserRole tUserRole);

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole update(TUserRole tUserRole);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}

