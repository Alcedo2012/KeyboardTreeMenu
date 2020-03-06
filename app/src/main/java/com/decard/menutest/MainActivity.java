package com.decard.menutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

//import com.decard.menutest.sub.Menu1;
//import com.decard.menutest.sub.Menu2;
//import com.decard.menutest.sub.Menu3;
//import com.decard.menutest.sub.Menu4;
//import com.decard.menutest.sub.Menu41;
//import com.decard.menutest.sub.Menu42;
//import com.decard.menutest.sub.Menu421;
//import com.decard.menutest.sub.Menu5;
//import com.decard.menutest.sub.Menu6;
import com.decard.lib.keyboardmenu.TreeMenu;
import com.decard.lib.keyboardmenu.TreeMenuController;
import com.decard.menutest.sub.MenuHandler1;
import com.decard.menutest.sub.MenuHandler2;
import com.decard.menutest.sub.MenuHandler3;
import com.decard.menutest.sub.MenuHandler4;
import com.decard.menutest.sub.MenuHandler41;
import com.decard.menutest.sub.MenuHandler411;
import com.decard.menutest.sub.MenuHandler412;
import com.decard.menutest.sub.MenuHandler42;
import com.decard.menutest.sub.MenuHandler421;
import com.decard.menutest.sub.MenuHandler422;
import com.decard.menutest.sub.MenuHandler423;
import com.decard.menutest.sub.MenuHandler5;
import com.decard.menutest.sub.MenuHandler6;
import com.decard.menutest.sub.MenuHandlerRoot;
//import com.decard.menutest.sub.MenuRoot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TreeMenuController menuController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuController = new TreeMenuController();
        List<TreeMenu> treeMenus = new ArrayList<>();
//        MenuRoot menuRoot = new MenuRoot(0,-1,"菜单首页","");
//        Menu1 menu1 = new Menu1(1,0,"1交易总汇","");
//        Menu2 menu2 = new Menu2(2,0,"2交易明细","");
//        Menu3 menu3 = new Menu3(3,0,"3银联签到","");
//        Menu4 menu4 = new Menu4(4,0,"4消费模式","");
//        Menu5 menu5 = new Menu5(5,0,"5终端信息","");
//        Menu6 menu6 = new Menu6(6,0,"6系统设置","");
//        Menu41 menu41 = new Menu41(41,4,"随机消费","");
//        Menu42 menu42 = new Menu42(42,4,"固定消费","");
//        Menu421 menu421 = new Menu421(421,42,"固定金额设置","");


//        treeMenus.add(menuRoot);
//        treeMenus.add(menu1);
//        treeMenus.add(menu2);
//        treeMenus.add(menu3);
//        treeMenus.add(menu4);
//        treeMenus.add(menu5);
//        treeMenus.add(menu6);
//        treeMenus.add(menu41);
//        treeMenus.add(menu42);
//        treeMenus.add(menu421);


        treeMenus.add(new TreeMenu(0,-1,"0菜单首页","",new MenuHandlerRoot()));
        treeMenus.add(new TreeMenu(1,0,"1交易总汇","",new MenuHandler1()));
        treeMenus.add(new TreeMenu(2,0,"2交易明细","",new MenuHandler2()));
        treeMenus.add(new TreeMenu(3,0,"3银联签到","",new MenuHandler3()));
        treeMenus.add(new TreeMenu(4,0,"4消费模式","",new MenuHandler4()));
        treeMenus.add(new TreeMenu(5,0,"5终端信息","",new MenuHandler5()));
        treeMenus.add(new TreeMenu(6,0,"6系统设置","",new MenuHandler6()));
        treeMenus.add(new TreeMenu(41,4,"41随机消费","",new MenuHandler41()));
        treeMenus.add(new TreeMenu(411,41,"411随机消费-开","",new MenuHandler411()));
        treeMenus.add(new TreeMenu(412,41,"412随机消费-关","",new MenuHandler412()));
        treeMenus.add(new TreeMenu(42,4,"42固定消费","",new MenuHandler42()));
        treeMenus.add(new TreeMenu(421,42,"421固定消费-开","",new MenuHandler421()));
        treeMenus.add(new TreeMenu(422,42,"422固定消费-关","",new MenuHandler422()));
        treeMenus.add(new TreeMenu(423,42,"423固定金额设置","",new MenuHandler423()));
        menuController.bind(treeMenus);
    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        Log.d("onKeyUp",event.toString());
        if(menuController.isMenuShowing()){
            menuController.onKey(keyCode);
        }

        if(keyCode == KeyEvent.KEYCODE_NUMPAD_DIVIDE){

            if(!menuController.isMenuShowing()){
                menuController.open();

            }

        }

        return true;
    }
}
