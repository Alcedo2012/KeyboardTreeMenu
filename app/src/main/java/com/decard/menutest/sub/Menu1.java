//package com.decard.menutest.sub;
//
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu1 extends TreeMenu {
//
//    public Menu1(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//        int id = -1;
//
//        switch (keyCode){
//
//            case KeyEvent.KEYCODE_NUMPAD_ADD:{
//                Log.d("Menu1","===================");
//                Log.d("Menu1","交易总汇--》查询下一个");
//                Log.d("Menu1","===================");
//            }
//            break;
//            case KeyEvent.KEYCODE_MINUS:{
//                Log.d("Menu1","===================");
//                Log.d("Menu1","交易总汇--》查询上一个");
//                Log.d("Menu1","===================");
//            }
//            break;
//        }
//
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
//        Log.d("Menu1","===================");
//        Log.d("Menu1","交易总汇--》查询中");
//        Log.d("Menu1","===================");
//    }
//}
