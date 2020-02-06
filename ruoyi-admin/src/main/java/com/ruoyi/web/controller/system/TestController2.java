package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

import java.util.List;

@Api("主页管理")
@Controller
public class TestController2 extends BaseController{


    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Test";
    }

    @ApiOperation("获取用户详细")
    @GetMapping("/2")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "int", paramType = "path")
    public String index2(){
            return redirect ("/swagger-ui.html");
    }

}
