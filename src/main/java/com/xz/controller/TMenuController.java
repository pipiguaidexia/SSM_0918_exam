package com.xz.controller;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import com.xz.service.TMenuService;
import com.xz.utils.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (TMenu)表控制层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@RestController
@RequestMapping("tMenu")
@CrossOrigin
public class TMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TMenuService tMenuService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("/all")
    public ResponseData queryAll() {
         List<TMenu> list =tMenuService.queryAll ();
        return ResponseData.ok().putDataValue ("menus",list);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TMenu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tMenu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TMenu> add(TMenu tMenu) {
        return ResponseEntity.ok(this.tMenuService.insert(tMenu));
    }

    /**
     * 编辑数据
     *
     * @param tMenu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TMenu> edit(TMenu tMenu) {
        return ResponseEntity.ok(this.tMenuService.update(tMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tMenuService.deleteById(id));
    }


    @GetMapping("/page/{currentPage}")
    public ResponseData  page(@PathVariable("currentPage") int currentPage){
        PageInfo<TMenu> pageInfo =tMenuService.queryMenus (currentPage);
        return ResponseData.ok ().putDataValue ("pageInfo",pageInfo);
    }

}


