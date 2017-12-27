package com.zhiwei.crisis.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiwei.crisis.service.service.api.AdminService;

/**
 * @author zzm
 * @version V1.0
 * @Description
 * @date 2017-12-11 17:32
 **/
@Service
public class AdminServiceImpl implements AdminService{
    @Override
    public String admin() {
        return "admin";
    }
}
