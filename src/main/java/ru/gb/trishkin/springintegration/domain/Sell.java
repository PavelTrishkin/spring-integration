package ru.gb.trishkin.springintegration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "sells")
public class Sell {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime created;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "product_title")
    private String productTitle;

    private Long amount;
    private BigDecimal sum;

}
