package com.zhiwei.crisis.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiwei.crisis.service.service.api.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzm
 * @version V1.0
 * @Description
 * @date 2017-12-11 17:28
 **/
@RestController
public class AdminController {
    @Reference
    private AdminService adminService;
    @GetMapping("admin")
    public Object admin(){
        return adminService.admin();
    }
}
