package com.web;

import com.domain.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by water on 2016/7/16.
 */

@RestController
public class SwaggerController {

    @ApiOperation(value = "getUser", nickname = "getUser")
    @RequestMapping(method = RequestMethod.POST, value="/get/user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "users", value = "user对象结构体",dataType = "com.domain.User")
    })//参数说明
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = User.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})//返回Httpcode及说明
    public User getUser(User users) {

        User user = User.builder()
                        .id("11")
                        .name("zhangsan")
                        .add("china")
                    .build();

        return  user;
    }

}
