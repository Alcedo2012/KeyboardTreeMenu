package com.decard.menutest.sub;

import android.util.Log;
import android.view.KeyEvent;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler2 implements MenuHandler {


    @Override
    public boolean onKey(int keyCode) {
        switch (keyCode){

            case KeyEvent.KEYCODE_NUMPAD_ADD:{
                Log.d("Menu2","交易明细--》查询下一个");
            }
            return true;
            case KeyEvent.KEYCODE_MINUS:{
                Log.d("Menu2","交易明细--》查询上一个");
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
        Log.d("Menu2","===================");
        Log.d("Menu2","交易明细--》查询中");
        Log.d("Menu2","===================");
    }

}
