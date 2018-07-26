package org.wingstudio.dao;

import org.wingstudio.entity.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}