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
public class CarPo3 {
    private Integer id;
    private String brand;
    //对应vo类中的name
    private String carName;
}