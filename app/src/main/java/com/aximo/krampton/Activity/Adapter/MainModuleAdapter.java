package com.aximo.krampton.Activity.Adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aximo.krampton.Activity.Model.MainModuleModel;
import com.aximo.krampton.R;

import java.util.ArrayList;

public class MainModuleAdapter extends BaseAdapter {

    MainModuleModel mainModuleModel;
    ArrayList<MainModuleModel> mainModuleModel_all;
    Context mContext;

    public MainModuleAdapter(Context context, ArrayList<MainModuleModel> arrayList) {
        this.mContext = context;
        this.mainModuleModel_all = arrayList;
    }

    public static class ViewHolder {
        ImageView main_module_pic;
        TextView module_counters, module_titles;
    }

    @Override
    public int getCount() {
        return mainModuleModel_all.size();
    }

    @Override
    public Object getItem(int i) {
        return mainModuleModel_all.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        final View result;
        if (convertView == null) {
            viewHolder = new MainModuleAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.main_module_grid_design, parent, false);

            viewHolder.main_module_pic = (ImageView) convertView.findViewById(R.id.module_icons_ids);
            viewHolder.module_counters = (TextView) convertView.findViewById(R.id.KT_counter_ids);
            viewHolder.module_titles = (TextView) convertView.findViewById(R.id.KT_title_ids);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MainModuleAdapter.ViewHolder) convertView.getTag();
        }
        mainModuleModel = new MainModuleModel();
        mainModuleModel = mainModuleModel_all.get(i);
String counter=mainModuleModel.getModule_counter();
        viewHolder.main_module_pic.setImageResource(mainModuleModel.getModule_image());
        viewHolder.module_counters.setText(mainModuleModel.getModule_counter());
        viewHolder.module_titles.setText(mainModuleModel.getModule_title());
        if (TextUtils.isEmpty(counter)){
            viewHolder.module_counters.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}


