package com.beyondsoft.gmall.service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: service.UserService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/8/12 14:06
 */
public interface UserService {

    /**
     * 获取用户地址列表
     * @param userId
     * @return
     */
    List getUserAddressList(String userId);

}
