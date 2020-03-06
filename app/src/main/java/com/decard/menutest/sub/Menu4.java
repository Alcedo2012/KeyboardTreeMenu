//package com.decard.menutest.sub;
//
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu4 extends TreeMenu {
//
//    public Menu4(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//
//
//        int id = -1;
//
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_1:{
//                id = getChildList().get(0).getId();
//            }
//            break;
//            case KeyEvent.KEYCODE_2:{
//                id = getChildList().get(1).getId();
//            }
//            break;
//        }
//
//        return false;
//    }
//
//
//    @Override
//    public boolean isTaskRunning() {
//        return false;
//    }
//
//    @Override
//    public void show() {
//        Log.d("Menu4","===================");
//        Log.d("Menu4","1，随机消费 2，固定消费");
//        Log.d("Menu4","===================");
//    }
//
//}
