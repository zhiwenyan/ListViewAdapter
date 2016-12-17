package com.example.zhiwenyan.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zhiwenyan on 3/6/16.
 */
public class BeanAdapter extends BaseAdapter {
    ArrayList<Bean> arrayList;
    Context context;

    public BeanAdapter(Context context, ArrayList<Bean> arrayList) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.desc = (TextView) convertView.findViewById(R.id.desc);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);
            convertView.setTag(viewHolder);
        } else {
            viewHolder=(ViewHolder) convertView.getTag();
            viewHolder.title.setText(arrayList.get(position).getTitle());
            viewHolder.desc.setText(arrayList.get(position).getDesc());
            viewHolder.time.setText(arrayList.get(position).getTime());

        }

        return convertView;
    }

    static class ViewHolder {
        TextView title, desc, time;
    }

}
