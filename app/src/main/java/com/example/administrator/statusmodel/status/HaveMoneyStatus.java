package com.example.administrator.statusmodel.status;

import android.util.Log;

/**
 * Created by dada on 2017/9/14.
 */

public class HaveMoneyStatus implements MachineActionListener {
    private Machine machine;
    private String TAG = "HaveMoneyStatus";

    public HaveMoneyStatus(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void interstMoney() {

    }

    @Override
    public void backMoney() {
         if(machine.getMoneyCount()<=0){
             Log.d(TAG, "backMoney: "+"全退光了，没钱了");
             machine.setListener(machine.getNoMoneyListener());
         }
        Log.d(TAG, "backMoney: "+"退一块钱");
    }


    @Override
    public void giveGood() {
        if (machine.getGoodCount()>0) {
            if(machine.getMoneyCount()>0){
                Log.d(TAG, "giveGood: "+"通过购买判定，准备扣款，出货");
                machine.setListener(machine.getGiveGoodListener());
                machine.giveGood();
            }else{
                Log.d(TAG, "giveGood: "+"请投币");
                machine.setListener(machine.getNoMoneyListener());
            }
        }else{
            Log.d(TAG, "giveGood: "+"请补充货物");
            machine.setListener(machine.getNoGoodListener());
        }
    }

    @Override
    public void addGood(int goodNum) {

    }
}
