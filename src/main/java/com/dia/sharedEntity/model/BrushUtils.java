package com.dia.sharedEntity.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * 开发公司：xx公司
 * 版权：xx公司
 * <p>
 * BrushUtils
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
@ApiModel(value="BrushUtils",description="查询参数")
public class BrushUtils<T> {

    @ApiModelProperty(value="排序对象",name="orders")
    private Orders orders = new Orders();

    @ApiModelProperty(value="分页对象",name="pagination")
    private Pagination pagination = new Pagination();

    @ApiModelProperty(value="查询对象",name="query")
    private T query;

    @ApiModelProperty(value="导出的表头信息",name="export")
    private List<Map<String,Object>> export;

    @ApiModelProperty(value="是否分页参数（0 分页， 1 不分页查全部数据）",name="type")
    private Integer type = 0;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public T getQuery() {
        return query;
    }

    public void setQuery(T query) {
        this.query = query;
    }

    public List<Map<String, Object>> getExport() {
        return export;
    }

    public void setExport(List<Map<String, Object>> export) {
        this.export = export;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}