package com.example.zhiwenyan.listviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Bean> arrayList;
    private ListView listView;
    Bean bean;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        initDatas();
        CommViewHolder connAdapter=new CommViewHolder(this,arrayList,R.layout.item_view);
        listView.setAdapter(connAdapter);

    }

    private void initDatas() {
        for (int i = 0; i <= 10; i++) {
            bean = new Bean();
            bean.setTitle("万能适配器");
            bean.setDesc("打造万能的适配器");
            bean.setTime("2016-1-1");
            arrayList.add(bean);
        }
    }
}
