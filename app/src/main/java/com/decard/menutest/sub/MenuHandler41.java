package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler41 implements MenuHandler {

    @Override
    public boolean onKey(int keyCode) {
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                Log.d("Menu41","===================");
//                Log.d("Menu41","随机消费--开");
//                Log.d("Menu41","===================");
//            }
//            return true;
//            case KeyEvent.KEYCODE_2:{
//                Log.d("Menu41","===================");
//                Log.d("Menu41","随机消费--关");
//                Log.d("Menu41","===================");
//            }
//            return true;
//        }
        return false;
    }

    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {
        Log.d("Menu41","===================");
        Log.d("Menu41","1，随机消费--开 2，随机消费--关");
        Log.d("Menu41","===================");
    }

}
