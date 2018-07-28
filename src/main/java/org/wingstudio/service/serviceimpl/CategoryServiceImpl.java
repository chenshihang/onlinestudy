package org.wingstudio.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wingstudio.dao.CategoryMapper;
import org.wingstudio.entity.Category;
import org.wingstudio.service.CategoryService;

import java.util.List;

/**
 * CategoryServiceImpl
 * create by chenshihang on 2018/7/28
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategories() {
        return categoryMapper.getCategories();
    }

    @Override
    public List<Integer> getIds() {
        List<Integer> result = categoryMapper.getIds();
        return result;
    }
}
