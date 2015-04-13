package com.king.SelfBillXUtils.bean;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Foreign;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Table;

/**
 * User: king
 * Date: 2015/4/12
 */
@Table(name = "extends")
public class Extend {
    @Id(column = "_id")
    private long id;
    @Column(column = "currenttime")
    private long currentTime;
    @Column(column = "money")
    private float money;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


}
