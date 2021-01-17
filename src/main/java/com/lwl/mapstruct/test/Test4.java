package com.lwl.mapstruct.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.CarPo3;
import com.lwl.mapstruct.po.CarPo4;
import com.lwl.mapstruct.vo.CarVo3;
import com.lwl.mapstruct.vo.CarVo4;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test4 {
    public static void main(String[] args) {
        // 集合类型转换，属性不一致
        List<CarPo4> list1s = new ArrayList<>();
        CarPo4 carPo4 = CarPo4.builder()
                .id(1)
                .brand("BC3")
                .carName("奔驰3")
                .createTime(new Date())
                .build();
        CarPo4 carPo4_1 = CarPo4.builder()
                .id(1)
                .brand("BC4")
                .carName("奔驰4")
                .createTime(new Date())
                .build();
        list1s.add(carPo4);
        list1s.add(carPo4_1);

        List<CarVo4> carVo1s = CarConvertBasic.INSTANCE.toConvertVos4(list1s);
        System.out.println(carVo1s);
    }
}
