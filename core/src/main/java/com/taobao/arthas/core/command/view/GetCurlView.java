package com.taobao.arthas.core.command.view;

import com.taobao.arthas.core.command.monitor200.curl.GetCurlModel;
import com.taobao.arthas.core.command.view.ResultView;
import com.taobao.arthas.core.shell.command.CommandProcess;

/**
 * @author zhaoyuening
 */
public class GetCurlView extends ResultView<GetCurlModel> {
    @Override
    public void draw(CommandProcess process, GetCurlModel result) {
        process.write(result.getCurl() + "\n");
    }
}
