package org.wingstudio.service;

import org.wingstudio.entity.Category;

import java.util.List;

/**
 * CategoryService
 * create by chenshihang on 2018/7/28
 */
public interface CategoryService {

    List<Category> getCategories();


    List<Integer> getIds();

}
