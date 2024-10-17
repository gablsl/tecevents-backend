package com.eventostec.api.controllers;

import com.eventostec.api.domain.coupon.Coupon;
import com.eventostec.api.domain.coupon.CouponRequestDTO;
import com.eventostec.api.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestParam("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping
    public ResponseEntity<Coupon> addCoupon(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon coupon = couponService.addCouponToEvent(eventId, data);
        return ResponseEntity.ok(coupon);
    }
}
