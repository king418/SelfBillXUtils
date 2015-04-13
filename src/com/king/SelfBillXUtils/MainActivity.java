package com.king.SelfBillXUtils;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @ViewInject(R.id.listView_main)
    private ListView listView_main;
    private DbUtils dbUtils;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    private void initDbUtils(){

        dbUtils = DbUtils.create(this, "myrecord.db", 1, new DbUtils.DbUpgradeListener() {
            @Override
            public void onUpgrade(DbUtils dbUtils, int i, int i1) {

            }
        });

    }

}
