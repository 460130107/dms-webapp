package com.xmomen.module.wx.module.address.controller;

import com.xmomen.framework.web.exceptions.ArgumentValidException;
import com.xmomen.module.member.service.MemberAddressService;
import com.xmomen.module.order.entity.TbOrder;
import com.xmomen.module.order.model.WxCreateOrder;
import com.xmomen.module.order.service.OrderService;
import com.xmomen.module.wx.module.order.model.MyOrderQuery;
import com.xmomen.module.wx.module.order.model.OrderDetailModel;
import com.xmomen.module.wx.module.order.model.OrderModel;
import com.xmomen.module.wx.module.order.service.MyOrderService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

@Controller
public class AddressController {

    @Autowired
    MemberAddressService memberAddressService;

    @Autowired
    OrderService orderService;

    /**
     * @param addressId 收货地址
     * @return
     */
    @RequestMapping(value = "/wx/defaultAddress", method = RequestMethod.GET)
    @ResponseBody
    public Boolean defaultAddress(
            @RequestParam(value = "addressId") String addressId) {
        memberAddressService.defaultAddress(addressId);
        return Boolean.TRUE;
    }
}
