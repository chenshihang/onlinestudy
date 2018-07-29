package org.wingstudio.service.serviceimpl;

import org.springframework.stereotype.Service;
import org.wingstudio.Common.Const;
import org.wingstudio.service.CommonService;

import javax.servlet.http.HttpServletRequest;

/**
 * CommonServiceImpl
 * create by chenshihang on 2018/7/29
 */
@Service
public class CommonServiceImpl implements CommonService{
    @Override
    public boolean guestIsOnline(HttpServletRequest request) {
        Object object = request.getSession().getAttribute(Const.CURRENT_GUEST);
        if(object == null){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public void addGuest(HttpServletRequest request) {
        int guest_num = (int) (Math.random()*10000);
        request.getSession().setAttribute(Const.CURRENT_GUEST,new StringBuilder("游客:").append(guest_num));
    }
}
