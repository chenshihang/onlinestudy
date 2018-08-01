package org.wingstudio.dao;

import org.apache.ibatis.annotations.Param;
import org.wingstudio.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student doLogin(@Param("stuNum") int stuNum, @Param("password") String password);
}