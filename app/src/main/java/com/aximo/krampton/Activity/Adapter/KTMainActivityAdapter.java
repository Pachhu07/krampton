package com.aximo.krampton.Activity.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.aximo.krampton.R;

import com.aximo.krampton.Activity.Model.MainActivityModel;

import java.util.ArrayList;

public class KTMainActivityAdapter extends BaseAdapter {
    public ArrayList<MainActivityModel> mainActivity_al;
    MainActivityModel mainActivityModel;
    Context mContext;

    public KTMainActivityAdapter(Context context, ArrayList<MainActivityModel> card_all) {
        this.mContext = context;
        this.mainActivity_al = card_all;
    }


    private static class ViewHolder {
        ImageView main_icons;
        TextView main_titles;
    }


    @Override
    public int getCount() {
        return mainActivity_al.size();
    }

    @Override
    public Object getItem(int position) {
        return mainActivity_al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.navigation_list_design,parent,false);
            viewHolder.main_icons = convertView.findViewById(R.id.img);
            viewHolder.main_titles = convertView.findViewById(R.id.name);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        mainActivityModel = new MainActivityModel();
        mainActivityModel = mainActivity_al.get(position);

        viewHolder.main_icons.setTag(position);
        viewHolder.main_titles.setTag(position);

        viewHolder.main_icons.setImageResource(mainActivityModel.getItemImage());
        viewHolder.main_titles.setText(mainActivityModel.getItemName());
        return convertView;

        }

    }
