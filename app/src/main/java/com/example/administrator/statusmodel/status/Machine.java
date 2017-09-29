package com.example.administrator.statusmodel.status;

import android.util.Log;

/**
 * Created by dada on 2017/9/14.
 * 售货机对象
 */

public class Machine {
    private MachineActionListener listener;
    private MachineActionListener oldListener;

    public void setMoneyCount(int moneyCount) {
        MoneyCount = moneyCount;
    }

    private int MoneyCount;
    private String TAG = "Machine";

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }

    private int goodCount;

    private MachineActionListener noMoneyStatus;
    private MachineActionListener noGoodStatus;
    private MachineActionListener haveMoneyStatus;
    private MachineActionListener giveGoodStatus;



    public Machine() {
        noMoneyStatus = new NoMoneyStatus(this);
        noGoodStatus = new NoGoodStatus(this);
        haveMoneyStatus = new HaveMoneyStatus(this);
        giveGoodStatus = new GiveGoodStatus(this);
        listener = noMoneyStatus;
        MoneyCount = 0;
    }

    public MachineActionListener getListener() {
        return listener;
    }

    public void setListener(MachineActionListener listener) {
        setOldListener(this.listener);
        this.listener = listener;
    }

    public int getMoneyCount() {
        return MoneyCount;
    }

    public void interstMoney() {
        Log.d(TAG, "interstMoney: "+"调用投币");
        MoneyCount+=1;
        listener.interstMoney();
    }

    public void backMoney() {
        if(MoneyCount>0){
            MoneyCount-=1;
        }else{
            Log.d(TAG, "backMoney: "+"退币失败");
        }
        listener.backMoney();
    }

    /**
     * 如果用户刚好剩下一块钱，先扣钱再调用接口的话，钱就是0，这个时候出货的判定就不成立了
     * 所以，要先判定是否购买成功，然后，同时发货退钱
     */
    public void giveGood() {
        Log.d(TAG, "giveGood: "+"调用发货");
        listener.giveGood();
    }

    public void addGood(int goodNum){
        Log.d(TAG, "addGood: "+"调用添加商品");
        goodCount = goodCount+goodNum;
        listener.addGood(goodNum);
    }

    public MachineActionListener getNoMoneyListener() {
        return noMoneyStatus;
    }

    public MachineActionListener getHaveMoneyListener() {
        return haveMoneyStatus;
    }


    public MachineActionListener getNoGoodListener() {
        return noGoodStatus;
    }

    public MachineActionListener getOldListener() {
        return oldListener;
    }
    public MachineActionListener getGiveGoodListener() {
        return giveGoodStatus;
    }

    public void setOldListener(MachineActionListener oldListener) {
        this.oldListener = oldListener;
    }
}
