package com.kuaishou.sz.sdk.log;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author zhaoyuening
 */
public class RequestCurl {

    public static final RequestCurl CURL = new RequestCurl();

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        if (Objects.isNull(requestAttributes)) {
            return null;
        }
        return requestAttributes.getRequest();
    }

    @Override
    public String toString() {
        try {
            HttpServletRequest request = getRequest();
            if (Objects.isNull(request)) {
                return "noCurl";
            }
            return new CurlBuilder(request).build();
        } catch (Exception skip) {
            return "noCurl";
        }
    }
}
