package com.example.administrator.statusmodel.status;

import android.util.Log;

/**
 * Created by dada on 2017/9/14.
 */

public class NoMoneyStatus implements MachineActionListener {
    private String TAG = "NoMoneyStatus";
    private Machine machine;

    public NoMoneyStatus(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void interstMoney() {
        Log.d(TAG, "interstMoney: " + "投币成功");
        machine.setListener(machine.getHaveMoneyListener());
    }

    @Override
    public void backMoney() {
        Log.d(TAG, "backMoney: " + "无钱可退");
    }


    @Override
    public void giveGood() {
        Log.d(TAG, "giveGood: " + "请投币");
    }

    @Override
    public void addGood(int goodNum) {

    }
}
