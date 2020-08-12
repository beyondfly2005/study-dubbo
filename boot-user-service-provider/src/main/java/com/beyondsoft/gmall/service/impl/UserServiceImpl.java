package com.beyondsoft.gmall.service.impl;

import com.beyondsoft.gmall.model.UserAddress;
import com.beyondsoft.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: serverice.impl.UserServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/8/12 14:20
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    public List getUserAddressList(String userId){
        List<UserAddress> list = new ArrayList<UserAddress>();
        UserAddress userAddress = new UserAddress();
        userAddress.setUserAddress("河北大街中山西路");
        list.add(userAddress);
        return list;
    }
}
