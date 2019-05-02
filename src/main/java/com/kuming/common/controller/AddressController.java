package com.kuming.common.controller;

import com.kuming.common.dto.Address;
import com.kuming.common.mapper.AddressMapper;
import com.kuming.common.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 龙鸣 on 2017/8/28.
 * Description:
 *
 * @author:龙鸣
 * @version:1.0
 */
@Controller
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private AddressMapper addressMapper;

    //获取地址信息
    @RequestMapping(value = "/getAddress")
    @ResponseBody
    public String getAddress(){

        List<Address> addressList=addressService.queryAllAddress();
//        List<Address> addresses = addressMapper.queryAddress();
        return "sucess";
    }
}
