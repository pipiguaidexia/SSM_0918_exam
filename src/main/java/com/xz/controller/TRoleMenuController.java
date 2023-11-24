package com.xz.controller;

import com.xz.pojo.TRoleMenu;
import com.xz.service.TRoleMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TRoleMenu)表控制层
 *
 * @author makejava
 * @since 2023-09-18 13:52:20
 */
@RestController
@RequestMapping("tRoleMenu")
public class TRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TRoleMenuService tRoleMenuService;


}


