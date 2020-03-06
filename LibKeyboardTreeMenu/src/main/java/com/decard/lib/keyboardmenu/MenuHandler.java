package com.decard.lib.keyboardmenu;


public interface MenuHandler {

    public abstract boolean onKey(int keyCode);
    public abstract boolean isTaskRunning();
    public abstract void show();

}
