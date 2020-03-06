package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler412 implements MenuHandler {

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
        Log.d("Menu412","===================");
        Log.d("Menu412","随机消费--已关闭");
        Log.d("Menu412","按【取消返回上一步】");
        Log.d("Menu412","===================");
    }

}
