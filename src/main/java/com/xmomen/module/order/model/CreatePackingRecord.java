package com.xmomen.module.order.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Jeng on 2016/5/21.
 */
public @Data class CreatePackingRecord implements Serializable {
    @NotNull
    @Length(min = 5, max = 50)
    private String upc;
    @NotNull
    private String orderNo;
    private Integer packingId;
}
