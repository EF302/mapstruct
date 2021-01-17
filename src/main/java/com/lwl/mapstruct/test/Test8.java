package com.lwl.mapstruct.test;

import java.util.Date;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.AttributePo7;
import com.lwl.mapstruct.po.AttributePo8;
import com.lwl.mapstruct.po.CarPo7;
import com.lwl.mapstruct.po.CarPo8;
import com.lwl.mapstruct.vo.CarVo7;
import com.lwl.mapstruct.vo.CarVo8;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test8 {
    public static void main(String[] args) {
        // 8.更新 Bean 对象
        AttributePo8 attributePo8 = AttributePo8.builder()
                .color("red")
                .price(100.0)
                .build();
        CarPo8 carPo8 = CarPo8.builder()
                .id(1)
                .brand("BC")
                .carName("奔驰")
                .createTime(new Date())
                .build();
        CarVo8 carVo8 = CarConvertBasic.INSTANCE.toConvertVo8(carPo8);
        System.out.println(carVo8);
        CarConvertBasic.INSTANCE.updateCarVo8(attributePo8,carVo8);
        System.out.println(carVo8);
    }
}
