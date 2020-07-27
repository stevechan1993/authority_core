package com.steve.authority.core.service;

import java.util.List;

public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 删除操作
     * @param record
     */
    int delete(T record);

    /**
     * 批量删除操作
     * @param record
     * @return
     */
    int delete(List<T> record);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    T findById(Long id);

//    PageResult findPage(PageRequest pageRequest);
}
