package com.taobao.arthas.core.command.monitor200.curl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.taobao.arthas.core.command.model.ResultModel;

/**
 * @author zhaoyuening
 */
public class RequestCurl {

    public static final RequestCurl CURL = new RequestCurl();

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        if (requestAttributes == null) {
            return null;
        }
        return requestAttributes.getRequest();
    }

    @Override
    public String toString() {
        try {
            HttpServletRequest request = getRequest();
            if (request == null) {
                return "noCurl";
            }
            return new CurlBuilder(request).build();
        } catch (Exception skip) {
            return "noCurl";
        }
    }
}
