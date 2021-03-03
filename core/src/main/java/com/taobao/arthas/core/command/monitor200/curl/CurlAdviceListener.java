package com.taobao.arthas.core.command.monitor200.curl;

import com.taobao.arthas.core.advisor.AdviceListenerAdapter;
import com.taobao.arthas.core.advisor.ArthasMethod;
import com.taobao.arthas.core.shell.command.CommandProcess;

/**
 * @author zhaoyuening
 */
public class CurlAdviceListener extends AdviceListenerAdapter {

    public CurlAdviceListener(CommandProcess process) {
        this.process = process;
    }

    private CommandProcess process;

    @Override
    public void before(ClassLoader loader, Class<?> clazz, ArthasMethod method, Object target, Object[] args) throws Throwable {
        process.appendResult(new CurlModel(clazz));
        process.end();
    }

    @Override
    public void afterReturning(ClassLoader loader, Class<?> clazz, ArthasMethod method, Object target, Object[] args, Object returnObject) throws Throwable {}

    @Override
    public void afterThrowing(ClassLoader loader, Class<?> clazz, ArthasMethod method, Object target, Object[] args, Throwable throwable) throws Throwable {}
}
