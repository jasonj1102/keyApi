package cn.edu.swpu.wxzx.provider.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cn.edu.swpu.wxzx.keys.UserService;

@Controller
@Api("demo")
public class DemoController {

    //@Reference(interfaceClass = UserService.class)
    UserService userService;

    @ApiOperation(value = "插入")
    @RequestMapping("/insert")
    public void get(@RequestParam("username") String username){
        userService.insert(username);
    }
}
