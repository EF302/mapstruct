package com.lwl.mapstruct.test;

import java.util.Date;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.AttributePo5;
import com.lwl.mapstruct.po.AttributePo6;
import com.lwl.mapstruct.po.CarPo5;
import com.lwl.mapstruct.po.CarPo6;
import com.lwl.mapstruct.vo.CarVo5;
import com.lwl.mapstruct.vo.CarVo6;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test6 {
    public static void main(String[] args) {
        // 6.vo、po中包含自定义对象属性
        AttributePo6 attributePo6 = AttributePo6.builder()
                .color("red")
                .jiage(100.0)
                .build();
        CarPo6 carPo6 = CarPo6.builder()
                .id(1)
                .brand("BC")
                .carName("奔驰")
                .createTime(new Date())
                .attributePo6(attributePo6)
                .build();
        CarVo6 carVo6 = CarConvertBasic.INSTANCE.toConvertVo6(carPo6);
        System.out.println(carVo6);
    }
}
