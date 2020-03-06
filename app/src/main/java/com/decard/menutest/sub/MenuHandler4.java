package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler4 implements MenuHandler {

    @Override
    public boolean onKey(int keyCode) {


//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                Log.d("Menu4","======1============");
//                return false;
//            }
//            case KeyEvent.KEYCODE_2:{
//                Log.d("Menu4","========2===========");
//                return false;
//            }
//        }

        return false;
    }


    @Override
    public boolean isTaskRunning() {
        return false;
    }

    @Override
    public void show() {
        Log.d("Menu4","===================");
        Log.d("Menu4","1，随机消费 2，固定消费");
        Log.d("Menu4","===================");
    }


}
