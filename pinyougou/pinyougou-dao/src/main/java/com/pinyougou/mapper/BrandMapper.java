package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @author 白
 * @create 2018-11-22 19:33
 **/
public interface BrandMapper {
    //查询全部品牌
    public List<TbBrand> queryAll();
}
