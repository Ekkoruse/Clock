package com.bytedance.clockapplication;

import android.util.Log;

import com.bytedance.clockapplication.widget.Clock;

import java.util.TimerTask;

public class MyTask extends TimerTask {//创建一个MyTask类继承于父类TimerTask

    Clock cc;
    MyTask(Clock c)
    {
        cc=c;
    }
    @Override
    public void run() {
        Log.d("MyTask", "tid: " + Thread.currentThread().getName());
        cc.post(new Runnable() {
            @Override
            public void run() {
                cc.setShowAnalog(cc.isShowAnalog());
            }
        });

    }
}
