package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler411 implements MenuHandler {

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
        Log.d("Menu411","===================");
        Log.d("Menu411","随机消费--已打开");
        Log.d("Menu411","按【取消返回上一步】");
        Log.d("Menu411","===================");
    }

}
