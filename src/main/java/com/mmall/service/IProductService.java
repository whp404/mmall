package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;
import org.apache.ibatis.annotations.Param;

public interface IProductService {

    public ServerResponse saveOrUpdateProduct(Product product);

    public ServerResponse setSaleStatus(@Param("productId") Integer productId, @Param("status") Integer status);

    public ServerResponse manageProductDetail(Integer productId);

    public  ServerResponse getProductList(int pageNum, int pageSize);

    public ServerResponse searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
