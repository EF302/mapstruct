package com.lwl.mapstruct.test;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.CarPo1;
import com.lwl.mapstruct.vo.CarVo1;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test1 {
    public static void main(String[] args) {
        // 属性一致
        CarPo1 carPo1 = CarPo1.builder()
                .id(1)
                .brand("BC")
                .build();
        CarVo1 carVo1 = CarConvertBasic.INSTANCE.toConvertVo1(carPo1);
        System.out.println(carVo1);
        CarPo1 carpo1_1=CarConvertBasic.INSTANCE.toConverPo1(carVo1);
        System.out.println(carpo1_1);
    }
}
