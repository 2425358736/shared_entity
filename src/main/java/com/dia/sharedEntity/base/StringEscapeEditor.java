package com.dia.sharedEntity.base;

import com.google.common.escape.Escaper;
import com.google.common.html.HtmlEscapers;

import java.beans.PropertyEditorSupport;

/**
 * 开发公司：xx公司
 * 版权：xx公司
 * <p>
 * StringEscapeEditor
 *
 * @author 刘志强
 * @created Create Time: 2019/2/18
 */
public class StringEscapeEditor extends PropertyEditorSupport {
    public StringEscapeEditor() {}

    @Override
    public String getAsText() {
        Object value = getValue();
        return value != null ? value.toString() : "";
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null) {
            setValue(null);
        } else {
            Escaper htmlEscaper = HtmlEscapers.htmlEscaper();
            setValue(htmlEscaper.escape(text));
        }
    }

}
