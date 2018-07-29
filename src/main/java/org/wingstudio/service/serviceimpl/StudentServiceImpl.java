package org.wingstudio.service.serviceimpl;

import org.springframework.stereotype.Service;
import org.wingstudio.Common.Const;
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
        Student student = new Student();
        student.setId(2);
        student.setStuNum(201604044);
        student.setName("小陈");
        student.setCreateTime(new Date());

        return student;
    }

    @Override
    public List<Video> getCollections(int stuId) {
        return null;
    }
}
