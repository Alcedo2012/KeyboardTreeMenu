package com.decard.lib.keyboardmenu;

import android.util.Log;
import android.view.KeyEvent;

import java.util.ArrayList;
import java.util.List;

public class TreeMenuController implements MenuOnKeyListener {

    private final String TAG = "TreeMenuController";
    private List<TreeMenu> menuList;
    private TreeMenu currentMenu;
    private boolean isMenuShowing;

    public boolean isMenuShowing() {
        return isMenuShowing;
    }

    private void setMenuShowing(boolean menuShowing) {
        isMenuShowing = menuShowing;
    }

    /**
     * 绑定菜单
     * @param mChildMenusList
     */
    public void bind(List<TreeMenu>  mChildMenusList){
        this.menuList = mChildMenusList;
        buildTree();
    }

    /**
     * 展示菜单
     */
    public void open(){
        Log.d(TAG,"open");
        setMenuShowing(true);
        TreeMenu rootMenu = findMenu(0);
        if(rootMenu!=null){
            currentMenu = rootMenu;
            currentMenu.show();
        }
    }

    /**
     * 关闭菜单
     */
    public void close(){
        setMenuShowing(false);
    }


    /**
     * 查找子菜单
     * @param id 编号
     * @return
     */
    private TreeMenu findMenu(int id){
        TreeMenu menuById = null;
        for (TreeMenu menu:menuList) {
            if(menu.getId()==id){
                menuById = menu;
                break;
            }
        }
        return menuById;
    }


    /**
     * 建立树形结构
     */
    private void buildTree(){
        TreeMenu rootMenu = findMenu(0);
//        List<TreeMenu>  mRootNodeList = new ArrayList<>();
//        mRootNodeList.add(rootMenu);
//
//        for(TreeMenu menu : mRootNodeList){
//            menu = buildChildTreeNode(menu);
//        }
        buildChildTreeNode(rootMenu);
    }


    /**
     * 递归模型
     * @param node 节点
     * @return
     */
    private TreeMenu buildChildTreeNode(TreeMenu node){

        List<TreeMenu>  mChildMenusList = new ArrayList<>();

        for (TreeMenu menuItem:this.menuList) {
            if(menuItem.getParentId() == node.getId()){
                mChildMenusList.add(buildChildTreeNode(menuItem));
            }
        }
        node.setChildList(mChildMenusList);
        return node;

    }


    private void backward(){



        int parentId = currentMenu.getParentId();
        Log.d(TAG,"backward : "+parentId);
        TreeMenu parentMenu = findMenu(parentId);
        if(parentMenu!=null){
            currentMenu = parentMenu;
            currentMenu.show();
        }else {
            close();
        }

    }


    private int getForwardKey(int keyCode){
        int keyValue = -1;
        switch (keyCode){
            case KeyEvent.KEYCODE_1:
            case KeyEvent.KEYCODE_NUMPAD_1:
                keyValue = 1;
                break;
            case KeyEvent.KEYCODE_2:
            case KeyEvent.KEYCODE_NUMPAD_2:
                keyValue = 2;
                break;
            case KeyEvent.KEYCODE_3:
            case KeyEvent.KEYCODE_NUMPAD_3:
                keyValue = 3;
                break;
            case KeyEvent.KEYCODE_4:
            case KeyEvent.KEYCODE_NUMPAD_4:
                keyValue = 4;
                break;
            case KeyEvent.KEYCODE_5:
            case KeyEvent.KEYCODE_NUMPAD_5:
                keyValue = 5;
                break;
            case KeyEvent.KEYCODE_6:
            case KeyEvent.KEYCODE_NUMPAD_6:
                keyValue = 6;
                break;
            case KeyEvent.KEYCODE_7:
            case KeyEvent.KEYCODE_NUMPAD_7:
                keyValue = 7;
                break;
            case KeyEvent.KEYCODE_8:
            case KeyEvent.KEYCODE_NUMPAD_8:
                keyValue = 8;
                break;
            case KeyEvent.KEYCODE_9:
            case KeyEvent.KEYCODE_NUMPAD_9:
                keyValue = 9;
                break;
            case KeyEvent.KEYCODE_0:
            case KeyEvent.KEYCODE_NUMPAD_0:
                keyValue = 0;
                break;
        }

        return keyValue;

    }


    private int getForwardId(int keyCode){

        int forwardId = getForwardKey(keyCode);
        if(forwardId<0){
            Log.e(TAG,"forward id invalid !!! ");
            return -1;
        }
        if(currentMenu.getChildList()!=null || !currentMenu.getChildList().isEmpty()){
            int size = currentMenu.getChildList().size();

            //在一页中可以用0代替第10个菜单
            if(forwardId==0){
                forwardId=10;
            }
            if(forwardId<=size){
                return currentMenu.getChildList().get(forwardId-1).getId();
            }

        }
        return -1;

    }

    private void forward(int targetId){
        Log.d(TAG,"forward : "+targetId);
        TreeMenu targetMenu = findMenu(targetId);
        if(targetMenu!=null){
            currentMenu = targetMenu;
            currentMenu.show();
        }

    }


    @Override
    public void onKey(int keyCode) {

        if(currentMenu.isTaskRunning()){
            //子菜单任务中
            Log.d("currentMenu",currentMenu.getName()+" -> isTaskRunning");
            return;
        }

        switch (keyCode){
            case KeyEvent.KEYCODE_ESCAPE:{
                backward();
                break;

            }


            default: {
//                int id = currentMenu.onKey(keyCode);
//                if(id>0){
//                    forward(id);
//                }
                if(!currentMenu.onKey(keyCode)){
                    forward(getForwardId(keyCode));
                }
            }
            break;


//            case KeyEvent.KEYCODE_0:
//            case KeyEvent.KEYCODE_1:
//            case KeyEvent.KEYCODE_2:
//            case KeyEvent.KEYCODE_3:
//            case KeyEvent.KEYCODE_4:
//            case KeyEvent.KEYCODE_5:
//            case KeyEvent.KEYCODE_6:
//            case KeyEvent.KEYCODE_7:
//            case KeyEvent.KEYCODE_8:
//            case KeyEvent.KEYCODE_9:
//            case KeyEvent.KEYCODE_NUMPAD_0:
//            case KeyEvent.KEYCODE_NUMPAD_1:
//            case KeyEvent.KEYCODE_NUMPAD_2:
//            case KeyEvent.KEYCODE_NUMPAD_3:
//            case KeyEvent.KEYCODE_NUMPAD_4:
//            case KeyEvent.KEYCODE_NUMPAD_5:
//            case KeyEvent.KEYCODE_NUMPAD_6:
//            case KeyEvent.KEYCODE_NUMPAD_7:
//            case KeyEvent.KEYCODE_NUMPAD_8:
//            case KeyEvent.KEYCODE_NUMPAD_9:
//            case KeyEvent.KEYCODE_PERIOD:
//            case KeyEvent.KEYCODE_PLUS:
//            case KeyEvent.KEYCODE_MINUS:
//            case KeyEvent.KEYCODE_ENTER:
//            case KeyEvent.KEYCODE_DEL:
//            case KeyEvent.KEYCODE_NUMPAD_MULTIPLY:
//                break;

        }
    }
}
