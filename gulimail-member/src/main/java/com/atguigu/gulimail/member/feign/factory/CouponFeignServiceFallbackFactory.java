package com.atguigu.gulimail.member.feign.factory;

import com.atguigu.common.utils.R;
import com.atguigu.gulimail.member.feign.CouponFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author : chenyv
 * @since : 2024-07-13 14:11
 */
@Slf4j
@Component
public class CouponFeignServiceFallbackFactory implements FallbackFactory<CouponFeignService> {
    @Override
    public CouponFeignService create(Throwable cause) {

        return new CouponFeignService() {
            @Override
            public R memberCoupons() {
                log.error(" CouponFeignService.memberCoupons error fallback ",cause);
                return R.ok();
            }
        };
    }
}
