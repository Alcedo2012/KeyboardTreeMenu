//package com.decard.menutest.sub;
//
//import android.os.Handler;
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.decard.menutest.TreeMenu;
//
//public class MenuRoot extends TreeMenu {
//
//    public MenuRoot(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//
//    public int onKey(int keyCode) {
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
//            case KeyEvent.KEYCODE_3:{
//                id = getChildList().get(2).getId();
//            }
//            break;
//            case KeyEvent.KEYCODE_4:{
//                id = getChildList().get(3).getId();
//            }
//            break;
//            case KeyEvent.KEYCODE_5:{
//                id = getChildList().get(4).getId();
//            }
//            break;
//        }
//
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
//        Log.d("MenuRoot","===================");
//        Log.d("MenuRoot","1交易总汇 2交易明细");
//        Log.d("MenuRoot","3银联签到 4消费模式");
//        Log.d("MenuRoot","5终端信息 6系统设置");
//        Log.d("MenuRoot","===================");
//
//    }
//}
