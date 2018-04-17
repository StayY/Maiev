package com.ych.monitor.collects.core;

import com.ych.monitor.collects.api.TransformMaker;

/**
 * @Author yechenhao
 * @Date 16/04/2018
 */
public class SpringControlMaker implements TransformMaker {

    private String className;

    private String methodName;

    private String requestUrl;

    public SpringControlMaker(String className, String methodName, String requestUrl) {
        this.className = className;
        this.methodName = methodName;
        this.requestUrl = requestUrl;
    }

    @Override
    public String begin() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("com.ych.monitor.collects.SpringControlCollect instance = com.ych.monitor.collects.SpringControlCollect.INSTANCE;");
        sBuilder.append("com.ych.monitor.bean.WebStatistics statics = (com.ych.monitor.bean.WebStatistics)instance.begin(\"%s\",\"%s\");");
        sBuilder.append("statics.setUrlAddress(\"%s\");");
        return String.format(sBuilder.toString(), className, methodName, requestUrl);
    }

    @Override
    public String end() {
        return "instance.end(statics);";
    }

    @Override
    public String error() {
        return "instance.error(statics, e);";
    }
}
