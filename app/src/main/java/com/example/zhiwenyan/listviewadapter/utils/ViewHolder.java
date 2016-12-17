package com.example.zhiwenyan.listviewadapter.utils;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zhiwenyan on 3/6/16.
 */
public class ViewHolder {
    private SparseArray<View> sparseArray;
    private int position;
    private View convertView;

    /**
     * @param context
     * @param parent
     * @param layoutId
     * @param position
     */
    public ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.position = position;
        this.convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        this.sparseArray = new SparseArray<>();
        convertView.setTag(this);
    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent
            , int layoutId, int position) {
        if (convertView == null) {
            return new ViewHolder(context, parent, layoutId, position);

        } else {
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.position = position;
            return viewHolder;
        }


    }

    //通过viewId获取控件对象
    public <T extends View> T getView(int viewId) {
        View view = sparseArray.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            sparseArray.put(viewId, view);
        }
        return (T) view;
    }


    public View getConvertView() {
        return convertView;
    }

    /**
     * 设置TextView的值
     *
     * @param viewId
     * @param text
     * @return
     */
    public ViewHolder setText(int viewId, String text) {
        TextView textView = getView(viewId);
        textView.setText(text);
        return this;
    }
}
