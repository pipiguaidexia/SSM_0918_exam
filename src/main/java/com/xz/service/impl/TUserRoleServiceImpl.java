package com.xz.service.impl;

import com.xz.pojo.TUserRole;
import com.xz.mapper.TUserRoleMapper;
import com.xz.service.TUserRoleService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TUserRole)表服务实现类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Service("tUserRoleService")
public class TUserRoleServiceImpl implements TUserRoleService {
    @Resource
    private TUserRoleMapper tUserRoleMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<TUserRole> queryAll() {
        return this.tUserRoleMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public TUserRole queryById(Integer userId) {
        return this.tUserRoleMapper.queryById(userId);
    }

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole insert(TUserRole tUserRole) {
        this.tUserRoleMapper.insert(tUserRole);
        return tUserRole;
    }

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole update(TUserRole tUserRole) {
        this.tUserRoleMapper.update(tUserRole);
        return this.queryById(tUserRole.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.tUserRoleMapper.deleteById(userId) > 0;
    }
}

