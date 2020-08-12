package com.beyondsoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beyondsoft.gmall.model.UserAddress;
import com.beyondsoft.gmall.service.OrderService;
import com.beyondsoft.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: service.impl.OrderServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/8/12 14:25
 */
@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference
    private UserService userService;

    /**
     * 初始化订单，查询用户的所有地址并返回
     * @param userId
     * @return
     */
    public void initOrder(String userId){
        System.out.println(userId);
        List<UserAddress> list = userService.getUserAddressList(userId);
        for (UserAddress userAddress : list ) {
            System.out.println(userAddress.getUserAddress());
        }

    }
}
