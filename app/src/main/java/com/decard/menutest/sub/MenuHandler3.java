package com.decard.menutest.sub;

import android.util.Log;
import com.decard.lib.keyboardmenu.MenuHandler;
public class MenuHandler3 implements MenuHandler {

    private boolean isTaskRunning = false;

    @Override
    public boolean onKey(int keyCode) {
        return false;
    }


    @Override
    public boolean isTaskRunning() {
        return isTaskRunning;
    }

    @Override
    public void show() {
        Log.d("Menu3","银联签到--》签到中");

        new Thread(new Runnable() {
            @Override
            public void run() {
                isTaskRunning = true;
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                isTaskRunning = false;
            }
        }).start();

    }

}
