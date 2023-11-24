package com.xz.mapper;

import com.xz.pojo.TRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (TRole)表数据库访问层
 *
 * @author makejava
 * @since 2023-09-18 13:40:51
 */
@Mapper
public interface TRoleMapper {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<TRole> queryAll();
     
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRole queryById(Integer id);
     
    /**
     * 统计总行数
     *
     * @param tRole 查询条件
     * @return 总行数
     */
    long count(TRole tRole);

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 影响行数
     */
    int insert(TRole tRole);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TRole> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TRole> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TRole> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TRole> entities);

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 影响行数
     */
    int update(TRole tRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


