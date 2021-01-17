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
public class CarVo4 {
    private Integer id;
    private String brand;
    //对应po类中carName
    private String name;
    //对应po类中Date类型的createTime
    private String createTime;
}
