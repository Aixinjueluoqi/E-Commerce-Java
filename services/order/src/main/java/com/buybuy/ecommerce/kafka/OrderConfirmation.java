package com.buybuy.ecommerce.kafka;

import com.buybuy.ecommerce.customer.CustomerResponse;
import com.buybuy.ecommerce.order.PaymentMethod;
import com.buybuy.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
