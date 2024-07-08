package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenyv
 * @email chenyv19980616@163.com
 * @date 2024-07-07 23:19:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
