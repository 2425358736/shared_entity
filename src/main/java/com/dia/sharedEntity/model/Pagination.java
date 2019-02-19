package com.dia.sharedEntity.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 开发公司：青岛海豚数据技术有限公司
 * 版权：青岛海豚数据技术有限公司
 * <p>
 * Pagination
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
@ApiModel(value="Pagination",description="分页信息")
public class Pagination {

    @ApiModelProperty(value="当前页",name="current")
    private Integer current = 1;

    @ApiModelProperty(value="显示条数",name="pageSize")
    private Integer pageSize = 15;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}