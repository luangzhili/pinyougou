package com.pinyougou.manage.controller;

/**
 * @author 白
 * @create 2018-11-23 8:40
 **/
import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌controller
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    /**
     * 注入品牌service
     *
     * 该Reference注解来自阿里巴巴：不是其它的，请注意不要引入错误注解
     * 记得使用的是@Reference，不是@Autowired
     */
    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
