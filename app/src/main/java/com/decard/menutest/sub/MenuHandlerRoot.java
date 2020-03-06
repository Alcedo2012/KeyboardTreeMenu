package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandlerRoot implements MenuHandler {


    public boolean onKey(int keyCode) {
        return false;
    }

    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {
        Log.d("MenuRoot","===================");
        Log.d("MenuRoot","1交易总汇 2交易明细");
        Log.d("MenuRoot","3银联签到 4消费模式");
        Log.d("MenuRoot","5终端信息 6系统设置");
        Log.d("MenuRoot","===================");

    }

}
