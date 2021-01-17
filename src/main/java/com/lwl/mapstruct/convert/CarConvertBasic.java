package com.lwl.mapstruct.convert;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.lwl.mapstruct.po.*;
import com.lwl.mapstruct.vo.AttributeVo7;
import com.lwl.mapstruct.vo.CarVo1;
import com.lwl.mapstruct.vo.CarVo2;
import com.lwl.mapstruct.vo.CarVo3;
import com.lwl.mapstruct.vo.CarVo4;
import com.lwl.mapstruct.vo.CarVo5;
import com.lwl.mapstruct.vo.CarVo6;
import com.lwl.mapstruct.vo.CarVo7;
import com.lwl.mapstruct.vo.CarVo8;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * todo
 *
 * @author longwanli
 * @date
 */
//@MapperConfig
//“spring”：生成的实现类上面会自动添加一个@Component注解，可以通过Spring的 @Autowired方式进行注入
//@Mapper(componentModel = "spring")
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarConvertBasic {

    CarConvertBasic INSTANCE = Mappers.getMapper(CarConvertBasic.class);

    /**
     * 1.属性名一致：@Mapping属性对应声明可省略
     * 1.2 属性名一致：反向
     *
     * @param source
     * @return
     */
//    @Mappings({
//            @Mapping(source = "id",target = "id"),
//            @Mapping(source = "brand",target = "brand")
//    })
    //等价
//    @Mapping(source = "id",target = "id")
//    @Mapping(source = "brand",target = "brand")
    CarVo1 toConvertVo1(CarPo1 source);

    //反向
    @InheritConfiguration(name = "sourceToTarget")
    CarPo1 toConverPo1(CarVo1 target);

    /**
     * 2.属性名称不一致、有多余属性
     * 属性名称不一致：用@Mapping指定；否则该属性注值失败
     * 多余属性：在编译时会有警告提示，可以在@Mapping中配置 ignore = true，当字段较多时，可以直接在@Mapper中设置unmappedTargetPolicy属性或者unmappedSourcePolicy属性为 ReportingPolicy.IGNORE即可
     *
     * @param source
     * @return
     */
    @Mapping(source = "carName", target = "name")
    @Mapping(source = "brand", target = "brand", ignore = true)//忽略brand属性
    CarVo2 toConvertVo2(CarPo2 source);

    /**
     * 3.集合类型转换
     *
     * @param source
     * @return
     */
    @Mapping(source = "carName", target = "name")
    CarVo3 toConvertVo3(CarPo3 source);

    List<CarVo3> toConvertVos3(List<CarPo3> source);


   /**
    * 4.集合类型转换，属性类型不一致
    *
    * @param source
    *@return com.lwl.mapstruct.vo.CarVo4
    *@author longwanli
    *@date 2021/1/15 14:58
    */
    @Mappings({
            @Mapping(source = "carName", target = "name"),
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    CarVo4 toConvertVo4(CarPo4 source);
    List<CarVo4> toConvertVos4(List<CarPo4> source);


    /**
     * 5.多对一映射
     * todo 注意：1）由调试可知，多对一映射时，如果多个对象中，有其中一个为null， 则直接返回null；2）存在属性名不一致或存在重名、类型不一致情况时，用参数名前缀标识
     *
     * @param source1
     * @param source2
     * @return com.lwl.mapstruct.vo.CarVo5
     * @author longwanli
     * @date 2021/1/13 9:30
     */
    @Mappings({
            @Mapping(source = "source1.carName", target = "name"),
            @Mapping(source = "source1.createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    CarVo5 toConvertVo5(CarPo5 source1, AttributePo5 source2);

    /**
     * 6.vo、po中包含自定义对象属性、自定义转换
     * 对象属性名不一致：用@Mapping指定
     * 对象属性中的属性名存在不一致：用@Mapping指定，带有对象属性前缀
     * 对象属性中的存在复杂关系映射：用自定义转换
     *
     * @param carPo6
     * @return com.lwl.mapstruct.vo.CarVo6
     * @author longwanli
     * @date 2021/1/15 9:39
     */
    @Mappings({
            @Mapping(source = "carName", target = "name"),
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "attributePo6", target = "attributeVo6"),
            @Mapping(source = "attributePo6.jiage", target = "attributeVo6.price")
    })
    CarVo6 toConvertVo6(CarPo6 carPo6);

    /**
     * 7.自定义转换：vo、po中包含自定义对象属性
     *  对象属性名不一致：用@Mapping指定
     *  对于某些类型， 无法通过代码生成器的形式来进行处理，就需要自定义的方法来进行转换。利用java8新特性，在接口中定义一个默认方法。
     *
     * @param carPo7
     * @return com.lwl.mapstruct.vo.CarVo7
     * @author longwanli
     * @date 2021/1/15 10:54
     */
    @Mappings({
            @Mapping(source = "carName", target = "name"),
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "attributePo7", target = "attributeVo7")
    })
    CarVo7 toConvertVo7(CarPo7 carPo7);

    /**
     * 7_1.自定义对象属性转换
     *
     * @param attributePo7
     * @return com.lwl.mapstruct.vo.AttributeVo7
     * @author longwanli
     * @date 2021/1/16 11:03
     */
    default AttributeVo7 toAttributeVo7(AttributePo7 attributePo7) {
        if (attributePo7 == null) {
            return null;
        }
        AttributeVo7 attributeVo7 = new AttributeVo7();
        attributeVo7.setPrice(attributePo7.getJiage());
        attributeVo7.setColor(attributePo7.getColor());
        attributeVo7.setResult(attributePo7.getDeleted().equals(1));
        return attributeVo7;
    }

    /**
     * 8.更新 Bean 对象
     * 有时候，我们不是想返回一个新的 Bean 对象，而是希望更新传入对象的一些属性。这个在实际的时候也会经常使用到。
     *
     * @param carPo8
     * @return com.lwl.mapstruct.vo.CarVo8
     * @author longwanli
     * @date 2021/1/16 11:20
     */
    @Mappings({
            @Mapping(source = "carName", target = "name"),
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    CarVo8 toConvertVo8(CarPo8 carPo8);//此时，price、color属性值缺失

    //注解@MappingTarget后面跟的对象会被更新：添加price、color属性
    void updateCarVo8(AttributePo8 attributePo8, @MappingTarget CarVo8 carVo8);
}