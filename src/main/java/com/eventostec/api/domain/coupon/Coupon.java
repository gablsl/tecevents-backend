package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private Integer discount;

    private Date validity;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
