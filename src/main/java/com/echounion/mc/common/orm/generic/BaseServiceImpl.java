package com.echounion.mc.common.orm.generic;

/**
 * GenericService的实现类, 其他的自定义 ServiceImpl, 继承自它,可以获得常用的增删查改操作,
 * 未实现的方法有 子类各自实现
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * Created by phuang on 2016/1/18.
 */
public abstract class BaseServiceImpl<Model,PK> implements BaseService<Model,PK> {

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     *
     * @return GenericDao实现类
     */
    public abstract BaseDao<Model, PK> getDao();

    @Override
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    @Override
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    @Override
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }

}
