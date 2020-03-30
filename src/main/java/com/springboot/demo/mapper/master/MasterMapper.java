package com.springboot.demo.mapper.master;

import org.springframework.stereotype.Component;

/**
 * @ClassName TestMapper
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/30 15:31
 * @Version V1.0
 **/
//@Mapper
@Component
public interface MasterMapper {
   // @Select("select * from test")
    String test();
}
