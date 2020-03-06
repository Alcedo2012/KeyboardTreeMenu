//package com.decard.menutest.sub;
//
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu2 extends TreeMenu {
//
//    public Menu2(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_NUMPAD_ADD:{
//                Log.d("Menu2","交易明细--》查询下一个");
//            }
//            break;
//            case KeyEvent.KEYCODE_MINUS:{
//                Log.d("Menu2","交易明细--》查询上一个");
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
//        Log.d("Menu2","===================");
//        Log.d("Menu2","交易明细--》查询中");
//        Log.d("Menu2","===================");
//    }
//}
