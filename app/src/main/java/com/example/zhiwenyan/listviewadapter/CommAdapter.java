package com.example.zhiwenyan.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.zhiwenyan.listviewadapter.utils.ViewHolder;

import java.util.ArrayList;

/**
 * Created by zhiwenyan on 3/6/16.
 */

/**
 * @param <T> 适合不同的Adapter
 */
public abstract class CommAdapter<T> extends BaseAdapter {
    private Context context;
    private ArrayList<T> data;
    private LayoutInflater mInflater;
    private int layoutId;

    public CommAdapter(Context context, ArrayList<T> data,int layoutId) {
        this.context = context;
        this.data = data;
        mInflater = LayoutInflater.from(context);
        this.layoutId=layoutId;
    }


    @Override
    public T getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = ViewHolder.get(context, convertView, parent, layoutId, position);
        convert(viewHolder, getItem(position));
        //convertView在ViewHolder里面
        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder viewHolder, T t);

}
