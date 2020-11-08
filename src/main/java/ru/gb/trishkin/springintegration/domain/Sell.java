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
@Table(name = "sells_tbl")
public class Sell {
    private static final String SEQUENCE_NAME = "sell_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;

    private LocalDateTime created;

    @Column(name = "order_id_fld")
    private Long orderId;

    @Column(name = "user_name_fld")
    private String userName;

    @Column(name = "product_title_fld")
    private String productTitle;

    @Column(name = "amount_fld")
    private Long amount;

    @Column(name = "sum_fld")
    private BigDecimal sum;

}
