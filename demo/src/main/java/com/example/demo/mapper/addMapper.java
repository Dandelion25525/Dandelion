package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface addMapper {
    @Insert("""
        insert into product(pro_name, price)
        VALUES (#{pro_name},#{price})
        """)
   void add(@Param("pro_name") String proName,@Param("price") String price);
}
