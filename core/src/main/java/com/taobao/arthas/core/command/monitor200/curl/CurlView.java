package com.taobao.arthas.core.command.monitor200.curl;

import com.taobao.arthas.core.command.view.ResultView;
import com.taobao.arthas.core.shell.command.CommandProcess;

/**
 * @author zhaoyuening
 */
public class CurlView extends ResultView<CurlModel> {
    @Override
    public void draw(CommandProcess process, CurlModel result) {
        process.write("curl=" + result.getCurl());
    }
}
