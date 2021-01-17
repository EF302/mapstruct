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
public class CarVo6 {
    private Integer id;
    private String brand;
    //对应po类中carName
    private String name;
    //对应po类中Date类型的createTime
    private String createTime;
    //对应po中的attributePo6
    private AttributeVo6 attributeVo6;
}
