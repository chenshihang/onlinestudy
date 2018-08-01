package org.wingstudio.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wingstudio.Common.Const;
import org.wingstudio.dao.StudentMapper;
import org.wingstudio.entity.Student;
import org.wingstudio.entity.Video;
import org.wingstudio.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * StudentServiceImpl
 * create by chenshihang on 2018/7/29
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student isOnline(HttpServletRequest request) {
        Object object = request.getSession().getAttribute(Const.CURRENT_STU);
        if(object==null){
            return null;
        }else {
            return (Student)object;
        }
    }

    @Override
    public Student doLogin(int stuNum, String password) {
        Student student =studentMapper.doLogin(stuNum,password);




        return student;
    }

    @Override
    public List<Video> getCollections(int stuId) {
        return null;
    }
}
