package com.xz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import com.xz.pojo.TRole;
import com.xz.mapper.TRoleMapper;
import com.xz.service.TRoleService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TRole)表服务实现类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Service("tRoleService")
public class TRoleServiceImpl implements TRoleService {
    @Resource
    private TRoleMapper tRoleMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<TRole> queryAll() {
        return this.tRoleMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TRole queryById(Integer id) {
        return this.tRoleMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole insert(TRole tRole) {
        this.tRoleMapper.insert(tRole);
        return tRole;
    }

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole update(TRole tRole) {
        this.tRoleMapper.update(tRole);
        return this.queryById(tRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tRoleMapper.deleteById(id) > 0;
    }

    @Override
    public PageInfo<TRole> queryRoles(int currentPage) {
        PageHelper.startPage(currentPage, 5);
        List<TRole> menuList = tRoleMapper.queryAll ();
        PageInfo<TRole> pageInfo = new PageInfo<TRole>(menuList);
        return pageInfo;
    }
}

