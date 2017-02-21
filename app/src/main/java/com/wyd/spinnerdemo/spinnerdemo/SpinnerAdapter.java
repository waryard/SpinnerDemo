package com.wyd.spinnerdemo.spinnerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyd on 2017/1/10.
 */

public class SpinnerAdapter extends BaseAdapter {
    List<String> list = new ArrayList<>();
    Context context;

    public SpinnerAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, null);
        TextView textView = (TextView) convertView.findViewById(R.id.name);
        textView.setText(list.get(position));
        if (0 == position) {
            textView.setTextColor(context.getResources().getColor(R.color.gray));
        }
        return convertView;
    }
}
