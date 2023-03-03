package com.bosen.product.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bosen.common.domain.BaseEntityData;
import lombok.Data;

/**
 * 分类品牌：一个分类多个品牌
 */
@Data
@TableName("bs_product_category_brand")
public class ProductCategoryBrand extends BaseEntityData {
    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 品牌ID
     */
    private Long brandId;

}
