package com.taobao.arthas.core.command.monitor200.curl;

import com.taobao.arthas.core.command.model.ResultModel;

/**
 * @author zhaoyuening
 */
public class GetCurlModel extends ResultModel {

    public GetCurlModel(Class clazz) {
        this.curl = new RequestCurl(clazz).toString();
    }

    private String curl;

    @Override
    public String getType() {
        return "curl";
    }

    public String getCurl() {
        return curl;
    }
}
