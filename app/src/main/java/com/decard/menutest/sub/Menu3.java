//package com.decard.menutest.sub;
//
//import android.util.Log;
//
//import com.decard.menutest.TreeMenu;
//
//public class Menu3 extends TreeMenu {
//
//    private boolean isTaskRunning = false;
//    public Menu3(int id, int parentId, String name, String desc) {
//        super(id, parentId, name, desc);
//    }
//
//    @Override
//    public int onKey(int keyCode) {
//
//        return -1;
//    }
//
//
//    @Override
//    public boolean isTaskRunning() {
//        return isTaskRunning;
//    }
//
//    @Override
//    public void show() {
//        Log.d("Menu3","银联签到--》签到中");
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                isTaskRunning = true;
//                try{
//                    Thread.sleep(3000);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                isTaskRunning = false;
//            }
//        }).start();
//
//    }
//
//}
