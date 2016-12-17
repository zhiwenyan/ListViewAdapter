package com.example.zhiwenyan.listviewadapter;

/**
 * Created by zhiwenyan on 3/6/16.
 */
public class Bean {

    private String title;
    private String desc;
    private String time;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }




    public Bean(String title, String desc, String time) {
        this.title = title;
        this.desc = desc;
        this.time = time;
    }

    public Bean() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
