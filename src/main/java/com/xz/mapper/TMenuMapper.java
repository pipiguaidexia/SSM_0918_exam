package com.xz.mapper;

import com.xz.pojo.TMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (TMenu)表数据库访问层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Mapper
public interface TMenuMapper {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TMenu> queryAll();

    List<TMenu> selectMenus(int limitIndex );
     
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMenu queryById(Integer id);
     
    /**
     * 统计总行数
     *
     * @param tMenu 查询条件
     * @return 总行数
     */
    long count(TMenu tMenu);

    /**
     * 新增数据
     *
     * @param tMenu 实例对象
     * @return 影响行数
     */
    int insert(TMenu tMenu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TMenu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TMenu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TMenu> entities);

    /**
     * 修改数据
     *
     * @param tMenu 实例对象
     * @return 影响行数
     */
    int update(TMenu tMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


