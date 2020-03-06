package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler5 implements MenuHandler {

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
        Log.d("Menu5","===================");
        Log.d("Menu5","1，银联直连 2，一卡通");
        Log.d("Menu5","===================");
    }

}
