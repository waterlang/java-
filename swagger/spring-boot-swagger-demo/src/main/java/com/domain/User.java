package com.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by water on 2016/7/16.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value="用户信息")
public class User {
    @ApiModelProperty(value = "主键")
    private String id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "地址")
    private String add;
}
