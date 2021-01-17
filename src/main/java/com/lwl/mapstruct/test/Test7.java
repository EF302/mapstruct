package com.lwl.mapstruct.test;

import java.util.Date;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.AttributePo6;
import com.lwl.mapstruct.po.AttributePo7;
import com.lwl.mapstruct.po.CarPo6;
import com.lwl.mapstruct.po.CarPo7;
import com.lwl.mapstruct.vo.CarVo6;
import com.lwl.mapstruct.vo.CarVo7;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test7 {
    public static void main(String[] args) {
        // 7.自定义转换：vo、po中包含自定义对象属性
        AttributePo7 attributePo7 = AttributePo7.builder()
                .color("red")
                .jiage(100.0)
                .deleted(1)
                .build();
        CarPo7 carPo7 = CarPo7.builder()
                .id(1)
                .brand("BC")
                .carName("奔驰")
                .createTime(new Date())
                .attributePo7(attributePo7)
                .build();
        CarVo7 carVo7 = CarConvertBasic.INSTANCE.toConvertVo7(carPo7);
        System.out.println(carVo7);
    }
}
