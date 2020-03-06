//package com.decard.menutest.sub;
//
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu42 extends TreeMenu {
//
//
//    public Menu42(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//
//        int id = -1;
//
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                Log.d("Menu42","固定消费--开");
//            }
//            break;
//            case KeyEvent.KEYCODE_2:{
//                Log.d("Menu42","固定消费--关");
//            }
//            break;
//            case KeyEvent.KEYCODE_3:{
//                Log.d("Menu42","固定金额设置");
//                id = getChildList().get(0).getId();
//            }
//            break;
//        }
//        return id;
//    }
//
//    @Override
//    public boolean isTaskRunning() {
//        return false;
//    }
//
//    @Override
//    public void show() {
//        Log.d("Menu42","===================");
//        Log.d("Menu42","1，固定消费--开 ");
//        Log.d("Menu42","2，固定消费--关 ");
//        Log.d("Menu42","3，固定金额设置 ");
//        Log.d("Menu42","===================");
//    }
//}
