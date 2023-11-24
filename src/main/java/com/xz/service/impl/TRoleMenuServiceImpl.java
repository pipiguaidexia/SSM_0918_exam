package com.xz.service.impl;

import com.xz.pojo.TRoleMenu;
import com.xz.mapper.TRoleMenuMapper;
import com.xz.service.TRoleMenuService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2023-09-18 13:52:20
 */
@Service("tRoleMenuService")
public class TRoleMenuServiceImpl implements TRoleMenuService {
    @Resource
    private TRoleMenuMapper tRoleMenuMapper;


}

