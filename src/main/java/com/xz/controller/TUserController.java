package com.xz.controller;

import com.github.pagehelper.PageInfo;
import com.xz.pojo.TMenu;
import com.xz.pojo.TUser;
import com.xz.pojo.vo.UserInfoVo;
import com.xz.pojo.vo.UserMenuvo;
import com.xz.service.TUserService;
import com.xz.utils.EnumCode;
import com.xz.utils.JWTUtil;
import com.xz.utils.ResponseData;
import com.xz.utils.SystemException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@RestController
@RequestMapping("tUser")
//@CrossOrigin
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("/all")
    public ResponseEntity<List<TUser>> queryAll() {
        return ResponseEntity.ok (this.tUserService.queryAll ());
    }

    /**
     * 通过主键查询单条数据
     * <p>
     * //     * @param id 主键
     *
     * @return 单条数据
     */
    @PostMapping("/selectById")
    public ResponseData queryById(@RequestBody TUser User) {
        List<UserMenuvo> list = tUserService.queryById (User.getId ());
        if (list != null)
            return ResponseData.ok ().putDataValue ("userinfo", list);
        else
            throw new SystemException (EnumCode.ACCOUNT_NOT_FOUND);
    }

    @PostMapping("/login")
    public ResponseData login(@RequestBody TUser user) {
        TUser tUser = tUserService.login (user);
        if (tUser != null) {
            String token = JWTUtil.generToken
                    (String.valueOf (tUser.getId ()), tUser.getAccount (), tUser.getNickname ());
            return ResponseData.ok ().putDataValue ("token", token).putDataValue ("user", tUser);
        } else {
            throw new SystemException (EnumCode.ACCOUNT_NOT_FOUND);
        }
    }

    @PostMapping("/info")
    public ResponseData getInfo(@RequestBody UserMenuvo userMenuvo) {

        return null;
    }

//    @GetMapping("/login")
//    public ResponseEntity<TUser> login(TUser user) {
//        TUser tUser = tUserService.login (user);
//        if (tUser != null) {
//            String token = JWTUtil.generToken
//                    (String.valueOf (tUser.getId ()), tUser.getAccount (), tUser.getNickname ());
//            HttpHeaders headers =new HttpHeaders ();
//            headers.add ("token",token);
//            return new  ResponseEntity(tUser,headers,HttpStatus.OK);
//        }
//        else {
//            throw new SystemException (EnumCode.ACCOUNT_NOT_FOUND);
//        }
//    }

    /**
     * 新增数据
     *
     * @param tUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TUser> add(TUser tUser) {
        return ResponseEntity.ok (this.tUserService.insert (tUser));
    }

    /**
     * 编辑数据
     *
     * @param tUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TUser> edit(TUser tUser) {

        return ResponseEntity.ok (this.tUserService.update (tUser));
    }
    @PostMapping("/update")
    public ResponseData update( @RequestBody  TUser tUser) {
        TUser update = tUserService.update (tUser);
        return ResponseData.ok ().putDataValue ("updatedserinfo",update);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok (this.tUserService.deleteById (id));
    }

    @PostMapping("/test")
    public ResponseData test() {
        throw new SystemException (EnumCode.NOT_PERMISSION);
    }

    @PostMapping("/logout")

    public ResponseData logout(@RequestBody String token) {
        if (token == null) {
            throw new SystemException (EnumCode.NOT_PERMISSION);
        }
        return ResponseData.ok ();
    }


    @GetMapping("/page/{currentPage}")
    public ResponseData  page(@PathVariable("currentPage") int currentPage){
        PageInfo<TUser> pageInfo =tUserService.queryUsers (currentPage);
        return ResponseData.ok ().putDataValue ("pageInfo",pageInfo);
    }

    @PostMapping("/addUser")
    public ResponseData addUser( @RequestBody  UserInfoVo userInfoVo){

        int i = tUserService.addUser (userInfoVo);
        if (i<2){
            return ResponseData.forbidden ();
        }
        else
        {
            return ResponseData.ok ().putDataValue ("userinfo",userInfoVo)
                    .putDataValue ("rows",i);
        }
    }


}


