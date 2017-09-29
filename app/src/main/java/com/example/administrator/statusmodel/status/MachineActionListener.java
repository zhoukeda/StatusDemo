package com.example.administrator.statusmodel.status;

/**
 * Created by dada on 2017/9/14.
 */

public interface MachineActionListener {
    //投币
    void interstMoney();
    //退钱
    void backMoney();
    //出商品
    void giveGood();
    //添加商品
    void addGood(int goodNum);
}
