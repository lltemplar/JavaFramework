package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags="接口所在的类")
@RequestMapping("/swagger")
public class SwaggerController {

    @RequestMapping(value="/list", method= RequestMethod.POST)
    @ApiOperation(value = "接口名", notes = "接口描述", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "length",value = "参数1", required = true, paramType = "path"),
            @ApiImplicitParam(name = "size",value = "参数2", required = true, paramType = "query"),
            @ApiImplicitParam(name = "page",value = "参数3", required = true, paramType = "header"),
            @ApiImplicitParam(name = "total",value = "参数4", required = true, paramType = "form"),
            @ApiImplicitParam(name = "start",value = "参数5",dataType = "string", paramType = "body")
    })
    public String register(){
        return "has permission";
    }
}