package com.xz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xz.mapper.TUserRoleMapper;
import com.xz.pojo.TMenu;
import com.xz.pojo.TUser;
import com.xz.mapper.TUserMapper;
import com.xz.pojo.TUserRole;
import com.xz.pojo.vo.UserInfoVo;
import com.xz.pojo.vo.UserMenuvo;
import com.xz.service.TUserService;
import com.xz.utils.EnumCode;
import com.xz.utils.SystemException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserMapper tUserMapper;

    @Resource
    private TUserRoleMapper tUserRoleMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<TUser> queryAll() {
        return this.tUserMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public List<UserMenuvo>  queryById(Integer id) {
        return this.tUserMapper.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserMapper.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserMapper.update(tUser);
        TUser tUser1 = tUserMapper.selectById (tUser);
        return tUser1;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tUserMapper.deleteById(id) > 0;
    }

    @Override
    public TUser login(TUser user) {
        TUser u =tUserMapper.queryAccount (user.getAccount ());
        if (u!=null){
            if (!u.getPassword ().equals (user.getPassword ())){
                throw new SystemException (EnumCode.PASSWORD_ERROR);
            }
        }
        return u;
    }

    @Override
    public PageInfo<TUser> queryUsers(int currentPage) {
        PageHelper.startPage(currentPage, 5);
        List<TUser> userList = tUserMapper.queryAll ();
        PageInfo<TUser> pageInfo = new PageInfo(userList);
        return pageInfo;
    }

    @Override
    public int addUser(UserInfoVo userInfoVo) {

        TUser tUser1 = tUserMapper.queryAccount (userInfoVo.getAccount ());
        if (tUser1 != null){
            throw new SystemException (EnumCode.ACCOUNT_ALREADY_EXISTS);
        }
        else {
            TUser tUser =new TUser ();
            tUser.setAccount (userInfoVo.getAccount ());
            tUser.setNickname (userInfoVo.getNickname ());
            tUser.setPassword (userInfoVo.getPassword ());

            int i = tUserMapper.insertSome (tUser);

            TUserRole tUserRole =new TUserRole ();
            tUserRole.setUserId (tUser.getId ());
            tUserRole.setRoleId (userInfoVo.getRole ());
            int j = tUserRoleMapper.insertSome (tUserRole);

            return i+j;
        }
    }


}

