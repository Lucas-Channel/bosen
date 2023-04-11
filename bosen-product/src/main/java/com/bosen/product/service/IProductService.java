package com.bosen.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bosen.common.constant.response.PageData;
import com.bosen.common.constant.response.ResponseData;
import com.bosen.common.vo.request.ApproveInfoVO;
import com.bosen.product.domain.ProductDO;
import com.bosen.product.vo.request.ProductQueryVO;
import com.bosen.product.vo.request.ProductUpsertVO;
import com.bosen.product.vo.response.ProductDetailVO;

public interface IProductService extends IService<ProductDO> {
    ResponseData<PageData<ProductDetailVO>> listPages(ProductQueryVO queryVO);

    ResponseData<PageData<ProductDetailVO>> listPagesForMerchant(ProductQueryVO queryVO);

    ResponseData<Void> upsertProduct(ProductUpsertVO formData);

    ResponseData<Void> approveProduct(ApproveInfoVO approveInfoVO);
}
