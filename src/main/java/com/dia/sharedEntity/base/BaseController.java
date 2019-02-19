package com.dia.sharedEntity.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * 开发公司：青岛海豚数据技术有限公司
 * 版权：青岛海豚数据技术有限公司
 * <p>
 * BaseController
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
public class BaseController {

    /**
     * 控制器本来就是单例，这样似乎更加合理
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        /**
         * 自动转换日期类型的字段格式
         */
        binder.registerCustomEditor(Date.class, new DateConvertEditor());
        /**
         * 防止XSS攻击
         */
        binder.registerCustomEditor(String.class, new StringEscapeEditor());
    }

}
