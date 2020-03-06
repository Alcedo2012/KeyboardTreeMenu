package com.decard.lib.keyboardmenu;

import java.util.List;

public class TreeMenu implements MenuHandler {
    private int id;
    private int parentId;
    private String name;
    private String desc;
    private List<TreeMenu> childList;
    private MenuHandler menuHandler;


    public TreeMenu(int id, int parentId, String name, String desc) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.desc = desc;
    }

    public TreeMenu(int id, int parentId, String name, String desc, MenuHandler menuHandler) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.desc = desc;
        this.menuHandler = menuHandler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<TreeMenu> getChildList() {
        return childList;
    }

    public void setChildList(List<TreeMenu> childList) {
        this.childList = childList;
    }

    public MenuHandler getMenuHandler() {
        return menuHandler;
    }

    public void setMenuHandler(MenuHandler menuHandler) {
        this.menuHandler = menuHandler;
    }

//    public abstract int onKey(int keyCode);
//    public abstract boolean isTaskRunning();
//    public abstract void show();
//

    @Override
    public boolean onKey(int keyCode){
       return getMenuHandler().onKey(keyCode);
    }
    @Override
    public boolean isTaskRunning(){
        return getMenuHandler().isTaskRunning();
    }
    @Override
    public void show(){
        getMenuHandler().show();
    }


//    @Override
//    public void onKey(int keyCode) {
//
//    }
//
//    @Override
//    public boolean isTaskRunning() {
//        return false;
//    }
}
