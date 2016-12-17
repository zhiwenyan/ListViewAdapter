package com.example.zhiwenyan.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.zhiwenyan.listviewadapter.utils.ViewHolder;

import java.util.ArrayList;

/**
 * Created by zhiwenyan on 3/6/16.
 */
public class CommViewHolder extends CommAdapter<Bean> {


    public CommViewHolder(Context context, ArrayList<Bean> mDatas,int layoutId) {
        super(context, mDatas,layoutId);
    }

    @Override
    public void convert(ViewHolder viewHolder, final Bean bean) {
        viewHolder.setText(R.id.title, bean.getTitle()).
                setText(R.id.desc, bean.getDesc()).
                setText(R.id.time, bean.getTime());

        final CheckBox checkBox=viewHolder.getView(R.id.checkbox);
       // bean.setChecked(checkBox.isChecked());
        checkBox.setChecked(bean.isChecked());
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bean.setChecked(checkBox.isChecked());


            }
        });
//        ((TextView) viewHolder.getView(R.id.title)).setText(bean.getTitle());
//        ((TextView) viewHolder.getView(R.id.desc)).setText(bean.getDesc());
//        ((TextView) viewHolder.getView(R.id.time)).setText(bean.getTime());
    }
}
