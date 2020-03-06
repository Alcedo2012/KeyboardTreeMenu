package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler6 implements MenuHandler {

    @Override
    public boolean onKey(int keyCode) {

        return false;
    }


    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {

        Log.d("Menu6","===================");
        Log.d("Menu6","1，语音开关 2，日志开关");
        Log.d("Menu6","3，云管开关 4，通讯开关");
        Log.d("Menu6","===================");
    }

}
