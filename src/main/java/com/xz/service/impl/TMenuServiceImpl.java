package com.xz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import com.xz.mapper.TMenuMapper;
import com.xz.service.TMenuService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TMenu)表服务实现类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Service("tMenuService")
public class TMenuServiceImpl implements TMenuService {
    @Resource
    private TMenuMapper tMenuMapper;

    @Override
    public PageInfo<TMenu> queryMenus(int currentPage) {
        PageHelper.startPage(currentPage, 5);
        List<TMenu> menuList = tMenuMapper.queryAll ();
        PageInfo<TMenu> pageInfo = new PageInfo<TMenu>(menuList);
        return pageInfo;
    }

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<TMenu> queryAll() {
        return this.tMenuMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMenu queryById(Integer id) {
        return this.tMenuMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param tMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TMenu insert(TMenu tMenu) {
        this.tMenuMapper.insert(tMenu);
        return tMenu;
    }

    /**
     * 修改数据
     *
     * @param tMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TMenu update(TMenu tMenu) {
        this.tMenuMapper.update(tMenu);
        return this.queryById(tMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tMenuMapper.deleteById(id) > 0;
    }
}

