package com.kuming.common.service.impl;

import com.kuming.common.dto.Address;
import com.kuming.common.mapper.AddressMapper;
import com.kuming.common.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 龙鸣 on 2017/8/27.
 * Description:
 *
 * @author:龙鸣
 * @version:1.0
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;
    //获取所有地址信息
    @Override
    public List<Address> queryAllAddress() {

        List<Address> addressList=addressMapper.queryAddress();
        return addressList;
    }
}
