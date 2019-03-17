package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

public interface IOrderService {

    public ServerResponse pay(Long orderNo, Integer userId, String path);

    public ServerResponse aliCallback(Map<String,String> params);

    public ServerResponse queryOrderPayStatus(Integer userid,Long orderNo);

    ServerResponse createOrder(Integer id, Integer shippingId);

    ServerResponse<String> cancel(Integer userId,Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse<OrderVo> getOrderDetail(Integer id, Long orderNo);

    ServerResponse<PageInfo> getOrderList(Integer id, int pageNum, int pageSize);


    //backend
    ServerResponse<PageInfo> manageList(int pageNum,int pageSize);
    ServerResponse<OrderVo> manageDetail(Long orderNo);
    ServerResponse<PageInfo> manageSearch(Long orderNo,int pageNum,int pageSize);
    ServerResponse<String> manageSendGoods(Long orderNo);

}
