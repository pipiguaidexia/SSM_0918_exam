package com.xz.service;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import java.util.List;

/**
 * (TMenu)表服务接口
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
public interface TMenuService {









    PageInfo <TMenu> queryMenus(int currentPage);
    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TMenu> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMenu queryById(Integer id);

    /**
     * 新增数据
     *
     * @param tMenu 实例对象
     * @return 实例对象
     */
    TMenu insert(TMenu tMenu);

    /**
     * 修改数据
     *
     * @param tMenu 实例对象
     * @return 实例对象
     */
    TMenu update(TMenu tMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

