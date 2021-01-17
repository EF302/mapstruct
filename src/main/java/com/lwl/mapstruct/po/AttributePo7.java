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
public class AttributePo7 {
    //对应vo类中的price
    private double jiage;
    //对应vo类中的color
    private String color;
    //对应vo类中的Boolean类型的result属性
    private Integer deleted;
}
