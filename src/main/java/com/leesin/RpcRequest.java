package com.leesin;

import java.io.Serializable;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/3/30 7:59
 * @version: ${VERSION}
 * @modified By:
 */
public class RpcRequest implements Serializable {

    private static final long serialVersionUID = 597742177675618456L;
    private String className;
    private String methodName;
    private Object[] parameters;
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
