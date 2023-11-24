package com.xz.controller;

import com.xz.pojo.TUserRole;
import com.xz.service.TUserRoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TUserRole)表控制层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@RestController
@RequestMapping("tUserRole")
public class TUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TUserRoleService tUserRoleService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping
    public ResponseEntity<List<TUserRole>> queryAll() {
        return ResponseEntity.ok(this.tUserRoleService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TUserRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tUserRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tUserRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TUserRole> add(TUserRole tUserRole) {
        return ResponseEntity.ok(this.tUserRoleService.insert(tUserRole));
    }

    /**
     * 编辑数据
     *
     * @param tUserRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TUserRole> edit(TUserRole tUserRole) {
        return ResponseEntity.ok(this.tUserRoleService.update(tUserRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tUserRoleService.deleteById(id));
    }

}


