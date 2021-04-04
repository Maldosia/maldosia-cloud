package org.maldosia.springcloud.service.impl;

import org.maldosia.springcloud.service.IPaymentHystrixService;

/**
 * create date: 2020/6/1 16:34
 **/
public class PaymentFallbackService implements IPaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_Timeout";
    }
}
