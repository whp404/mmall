package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.List;

public interface ICategoryService {

    public ServerResponse addCategory(String categoryName, Integer parentId);

    public ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    public ServerResponse getChildrenParallelCategory(Integer categoryId);

    public ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
