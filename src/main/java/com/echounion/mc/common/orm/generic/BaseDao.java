package com.echounion.mc.common.orm.generic;

/**
 * 所有自定义Dao的顶级接口, 封装常用的增删查改操作,
 * 可以通过Mybatis Generator Maven 插件自动生成Dao,
 * 也可以手动编码,然后继承GenericDao 即可.
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * Created by phuang on 2016/1/18.
 */
public interface BaseDao<Model,PK> {

    /**
     * 删除对象
     * @param id
     * @return
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 插入对象
     * @param record
     * @return
     */
    int insertSelective(Model record);

    /**
     * 通过主键，查询对象
     * @param id
     * @return
     */
    Model selectByPrimaryKey(PK id);

    /**
     * 更新对象
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Model record);

}
