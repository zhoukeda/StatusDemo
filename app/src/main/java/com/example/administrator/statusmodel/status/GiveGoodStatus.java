package com.example.administrator.statusmodel.status;

import android.util.Log;

/**
 * Created by dada on 2017/9/14.
 */

public class GiveGoodStatus implements MachineActionListener {
    private Machine machine;
    private String TAG = "GiveGoodStatus";
    public GiveGoodStatus(Machine machine) {
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
        Log.d(TAG, "giveGood: "+"扣款成功，准备出货");
        machine.setMoneyCount(machine.getMoneyCount()-1);
        machine.setGoodCount(machine.getGoodCount()-1);
        if(machine.getMoneyCount()<=0){
            machine.setListener(machine.getNoMoneyListener());
            return;
        }
        if(machine.getGoodCount()<=0){
            machine.setListener(machine.getNoGoodListener());
            return;
        }
    }

    @Override
    public void addGood(int goodNum) {

    }
}
