//package com.decard.menutest.sub;
//
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu41 extends TreeMenu {
//
//    public Menu41(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                Log.d("Menu41","===================");
//                Log.d("Menu41","随机消费--开");
//                Log.d("Menu41","===================");
//            }
//            break;
//            case KeyEvent.KEYCODE_2:{
//                Log.d("Menu41","===================");
//                Log.d("Menu41","随机消费--关");
//                Log.d("Menu41","===================");
//            }
//            break;
//        }
//        return -1;
//    }
//
//    @Override
//    public boolean isTaskRunning() {
//        return false;
//    }
//
//    @Override
//    public void show() {
//        Log.d("Menu41","===================");
//        Log.d("Menu41","1，随机消费--开 2，随机消费--关");
//        Log.d("Menu41","===================");
//    }
//}
