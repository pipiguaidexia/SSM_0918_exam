package com.xz.controller;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import com.xz.pojo.TRole;
import com.xz.service.TRoleService;
import com.xz.utils.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TRole)表控制层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@RestController
@RequestMapping("tRole")
public class TRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TRoleService tRoleService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping
    public ResponseEntity<List<TRole>> queryAll() {
        return ResponseEntity.ok(this.tRoleService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TRole> add(TRole tRole) {
        return ResponseEntity.ok(this.tRoleService.insert(tRole));
    }

    /**
     * 编辑数据
     *
     * @param tRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TRole> edit(TRole tRole) {
        return ResponseEntity.ok(this.tRoleService.update(tRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tRoleService.deleteById(id));
    }

    @GetMapping("/page/{currentPage}")
    public ResponseData page(@PathVariable("currentPage") int currentPage){
        PageInfo<TRole> pageInfo =tRoleService.queryRoles (currentPage);
        return ResponseData.ok ().putDataValue ("pageInfo",pageInfo);
    }
}


