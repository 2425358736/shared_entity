package com.dia.sharedEntity.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 开发公司：青岛海豚数据技术有限公司
 * 版权：青岛海豚数据技术有限公司
 * <p>
 * Orders
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
@ApiModel(value="Orders",description="排序信息")
public class Orders {

    @ApiModelProperty(value="排序属性",name="name")
    private String name = "a.id";

    @ApiModelProperty(value="排序方式",name="type")
    private String type = "desc";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        if ("asc".equals(type)) {
            type = "asc";
        } else {
            type = "desc";
        }
        this.type = type;
    }
}