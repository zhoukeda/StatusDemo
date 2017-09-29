package com.example.administrator.statusmodel.status;

import android.util.Log;

/**
 * Created by dada on 2017/9/14.
 */

public class NoGoodStatus implements MachineActionListener {
    private String TAG = "NoGoodStatus";
    private Machine machine;

    public NoGoodStatus(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void interstMoney() {

    }

    @Override
    public void backMoney() {

    }


    @Override
    public void giveGood() {
        Log.d(TAG, "giveGood: " + "商品库存不足");
    }

    @Override
    public void addGood(int goodNum) {
        Log.d(TAG, "addGood: " + "添加商品成功，返回上一个状态");
        machine.setListener(machine.getOldListener());
    }
}
