package com.lwl.mapstruct.test;

import java.util.ArrayList;
import java.util.List;

import com.lwl.mapstruct.convert.CarConvertBasic;
import com.lwl.mapstruct.po.CarPo2;
import com.lwl.mapstruct.po.CarPo3;
import com.lwl.mapstruct.vo.CarVo2;
import com.lwl.mapstruct.vo.CarVo3;

/**
 * todo
 *
 * @author longwanli
 * @date
 */
public class Test3 {
    public static void main(String[] args) {
        // 集合类型转换
        List<CarPo3> list1s = new ArrayList<>();
        CarPo3 carPo3 = CarPo3.builder()
                .id(1)
                .brand("BC3")
                .carName("奔驰3")
                .build();
        CarPo3 carPo3_1 = CarPo3.builder()
                .id(1)
                .brand("BC4")
                .carName("奔驰4")
                .build();
        list1s.add(carPo3);
        list1s.add(carPo3_1);

        List<CarVo3> carVo1s = CarConvertBasic.INSTANCE.toConvertVos3(list1s);
        System.out.println(carVo1s);
    }
}
