package com.kuming.common.service;


import com.kuming.common.dto.Address;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 龙鸣 on 2017/8/27.
 * Description:
 *
 * @author:龙鸣
 * @version:1.0
 */
public interface AddressService {

    //获取所有地址信息
    public List<Address> queryAllAddress();
}
