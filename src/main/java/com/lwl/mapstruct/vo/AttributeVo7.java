package com.lwl.mapstruct.vo;

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
public class AttributeVo7 {
    //对应vo类中的price
    private double price;
    //对应vo类中的color
    private String color;
    //对应po类中Integer类型的delete属性
    private Boolean result;
}
