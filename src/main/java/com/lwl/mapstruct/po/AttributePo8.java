package com.lwl.mapstruct.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributePo8 {
    //对应vo类中的price
    private double price;
    //对应vo类中的color
    private String color;
}
