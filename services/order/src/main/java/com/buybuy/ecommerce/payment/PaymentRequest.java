package com.buybuy.ecommerce.payment;

import com.buybuy.ecommerce.customer.CustomerResponse;
import com.buybuy.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
