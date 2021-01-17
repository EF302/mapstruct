package com.lwl.mapstruct.test;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.CarPo1;
import com.lwl.mapstruct.po.CarPo2;
import com.lwl.mapstruct.vo.CarVo1;
import com.lwl.mapstruct.vo.CarVo2;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test2 {
    public static void main(String[] args) {
        // 2.属性名称不一致
        CarPo2 carPo2 = CarPo2.builder()
                .id(1)
                .brand("BC")
                .carName("奔驰")
                .extra("多余属性")
                .build();
        CarVo2 carVo2 = CarConvertBasic.INSTANCE.toConvertVo2(carPo2);
        System.out.println(carVo2);
    }
}
