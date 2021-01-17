package com.lwl.mapstruct.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.AttributePo5;
import com.lwl.mapstruct.po.CarPo4;
import com.lwl.mapstruct.po.CarPo5;
import com.lwl.mapstruct.vo.CarVo4;
import com.lwl.mapstruct.vo.CarVo5;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test5 {
    public static void main(String[] args) {
        // 多对一映射
        CarPo5 carPo = CarPo5.builder()
                .id(1)
                .brand("BC")
                .carName("奔驰")
                .createTime(new Date())
                .build();
        AttributePo5 attributePo = AttributePo5.builder()
                .color("red")
                .price(100000)
                .build();
        CarVo5 carBo = CarConvertBasic.INSTANCE.toConvertVo5(carPo, attributePo);
        System.out.println(carBo);
    }
}
