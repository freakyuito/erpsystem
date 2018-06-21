package cn.overseachem.erp.utils;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
public class AjaxReturn {
    private boolean status;
    private Object content;

    public AjaxReturn(boolean status, Object content) {
        this.status = status;
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
