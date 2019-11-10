package com.example.demo.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("City")
public class City {
    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

}
