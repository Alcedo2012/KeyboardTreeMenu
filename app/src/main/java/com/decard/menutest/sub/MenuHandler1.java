package com.decard.menutest.sub;

import android.util.Log;
import android.view.KeyEvent;

import com.decard.lib.keyboardmenu.MenuHandler;

public class MenuHandler1 implements MenuHandler {

    @Override
    public boolean onKey(int keyCode) {
        int id = -1;

        switch (keyCode){

            case KeyEvent.KEYCODE_NUMPAD_ADD:{
                Log.d("Menu1","===================");
                Log.d("Menu1","交易总汇--》查询下一个");
                Log.d("Menu1","===================");
            }
            return true;
            case KeyEvent.KEYCODE_MINUS:{
                Log.d("Menu1","===================");
                Log.d("Menu1","交易总汇--》查询上一个");
                Log.d("Menu1","===================");
            }
            return true;
        }

        return false;
    }

    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {
        Log.d("Menu1","===================");
        Log.d("Menu1","交易总汇--》查询中");
        Log.d("Menu1","===================");
    }
}
