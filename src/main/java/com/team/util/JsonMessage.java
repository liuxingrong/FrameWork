package com.team.util;

/**
 * Created by lxr on 2017/6/3.
 */
public class JsonMessage {
    private boolean status;
    private String msg;
    private Object data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String message)
    {
        msg=message;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object odata)
    {
        data=odata;
    }
}
