package com.xz.service;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TRole;
import java.util.List;

/**
 * (TRole)表服务接口
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public interface TRoleService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TRole> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRole queryById(Integer id);

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    TRole insert(TRole tRole);

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    TRole update(TRole tRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    PageInfo<TRole> queryRoles(int currentPage);
}

