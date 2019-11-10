package com.example.demo.dao.master;


import com.example.demo.domain.City;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MasterCityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    @Select("SELECT * FROM city where city_name = #{cityName}")
    @ResultType(value = City.class)
    City findByName2(@Param("cityName") String cityName);

    @Update("update city set description = #{description} where city_name = #{cityName}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description")
    })
    int update(@Param("cityName") String cityName, @Param("description") String desc);
}
