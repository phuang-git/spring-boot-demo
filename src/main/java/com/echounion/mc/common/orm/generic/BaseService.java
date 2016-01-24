package com.echounion.mc.common.orm.generic;

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * Created by phuang on 2016/1/18.
 */
public interface BaseService<Model,PK> {
    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insert(Model model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int update(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int delete(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    Model selectById(PK id);

}
