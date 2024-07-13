package com.atguigu.gulimail.member.feign;

import com.atguigu.common.utils.R;
import com.atguigu.gulimail.member.feign.factory.CouponFeignServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : chenyv
 * @since : 2024-07-11 22:03
 */
@FeignClient(value = "gulimail-coupon", fallbackFactory = CouponFeignServiceFallbackFactory.class)
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
