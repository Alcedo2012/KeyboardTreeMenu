package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler423 implements MenuHandler {


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
        Log.d("Menu423","===================");
        Log.d("Menu423","请设置固定金额 ");
        Log.d("Menu423","===================");
    }

}
