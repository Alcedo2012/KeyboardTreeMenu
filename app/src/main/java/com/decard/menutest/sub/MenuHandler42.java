package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler42 implements MenuHandler {


    @Override
    public boolean onKey(int keyCode) {

//        int id = -1;
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                Log.d("Menu42","固定消费--开");
//            }
//            return true;
//            case KeyEvent.KEYCODE_2:{
//                Log.d("Menu42","固定消费--关");
//            }
//            return true;
//            case KeyEvent.KEYCODE_3:{
//                Log.d("Menu42","固定金额设置");
//            }
//            return false;
//        }
        return false;
    }

    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {
        Log.d("Menu42","===================");
        Log.d("Menu42","1，固定消费--开 ");
        Log.d("Menu42","2，固定消费--关 ");
        Log.d("Menu42","3，固定金额设置 ");
        Log.d("Menu42","===================");
    }

}
