package com.dia.sharedEntity.result;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 开发公司：xx公司
 * 版权：xx公司
 * <p>
 * CommonResult
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
@ApiModel(value="CommonResult",description="返回对象")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CommonResult<T> implements Serializable {

    @ApiModelProperty(value="状态码",name="status")
    private Integer status;
    @ApiModelProperty(value="详细信息",name="subMsg")
    private String subMsg;
    @ApiModelProperty(value="提示信息",name="msg")
    private String msg;
    @ApiModelProperty(value="数据信息",name="data")
    private T data;
    @ApiModelProperty(value="版本号",name="version")
    private String version;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    /**
     *成功响应
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> successReturnDate(T data) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(data);
        result.setMsg("成功");
        result.setStatus(200);
        result.setSubMsg("");
        result.setVersion("1.0");
        return result;
    }

    /**
     *成功响应
     * @param data
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> successReturnDate(T data, String msg) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(data);
        result.setMsg(msg);
        result.setStatus(200);
        result.setSubMsg("");
        result.setVersion("1.0");
        return result;
    }

    /**
     * 成功响应
     * @param data
     * @param msg
     * @param version
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> successReturn(T data, String msg, String version) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(data);
        result.setMsg(msg);
        result.setStatus(200);
        result.setSubMsg("");
        result.setVersion(version);
        return result;
    }

    /**
     * 成功响应
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> successReturn(String msg) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(null);
        result.setMsg(msg);
        result.setStatus(200);
        result.setSubMsg("");
        result.setVersion("1.0");
        return result;
    }


    /**
     * 异常响应
     * @param status
     * @param msg
     * @param subMsg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> errorReturn(Integer status, String msg, String subMsg) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(null);
        result.setMsg(msg);
        result.setStatus(status);
        result.setSubMsg(subMsg);
        result.setVersion("1.0");
        return result;
    }

    /**
     * 异常响应
     * @param status
     * @param msg
     * @param subMsg
     * @param version
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> errorReturn(Integer status, String msg, String subMsg, String version) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(null);
        result.setMsg(msg);
        result.setStatus(status);
        result.setSubMsg(subMsg);
        result.setVersion(version);
        return result;
    }

    /**
     * 异常信息
     * @param status
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> errorReturn(Integer status, String msg) {
        CommonResult<T> result = new CommonResult<T>();
        result.setData(null);
        result.setMsg(msg);
        result.setStatus(status);
        result.setSubMsg("");
        result.setVersion("1.0");
        return result;
    }

}
