package com.example.administrator.statusmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.statusmodel.status.Machine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Machine machine = new Machine();
        machine.setGoodCount(4);
        machine.interstMoney();
        machine.backMoney();
        machine.backMoney();
        machine.backMoney();
        machine.giveGood();
        machine.giveGood();
        machine.interstMoney();
        machine.interstMoney();
        machine.interstMoney();
        machine.interstMoney();
        machine.interstMoney();
        machine.giveGood();
        machine.giveGood();
        machine.giveGood();
        machine.giveGood();
        machine.giveGood();
        machine.addGood(3);
        machine.giveGood();
        machine.giveGood();
        machine.giveGood();
    }
}
