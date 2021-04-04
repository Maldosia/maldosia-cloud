package org.maldosia.springcloud.service.impl;

import org.maldosia.springcloud.dao.PaymentDao;
import org.maldosia.springcloud.entities.Payment;
import org.maldosia.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * create date: 2020/5/27 16:22
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    //@Autowired SPRING 提供的
    @Resource //JAVA 提供的
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
