package com.dia.sharedEntity.model;

/**
 * 开发公司：xx公司
 * 版权：xx公司
 * <p>
 * PageHelper
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
public class PageHelper {
    /**
     * 查询总页数
     * @param brushUtils
     */
    public static void startPage(BrushUtils brushUtils) {
        if (brushUtils != null && brushUtils.getPagination() != null && brushUtils.getType() == 0) {
            com.github.pagehelper.PageHelper.startPage(brushUtils.getPagination().getCurrent(), brushUtils.getPagination().getPageSize());
        }
    }

    /**
     * 不查询总页数
     * @param brushUtils
     */
    public static void startPageNoCount(BrushUtils brushUtils) {
        if (brushUtils != null && brushUtils.getPagination() != null && brushUtils.getType() == 0) {
            com.github.pagehelper.PageHelper.startPage(brushUtils.getPagination().getCurrent(), brushUtils.getPagination().getPageSize(), false);
        }
    }
}
