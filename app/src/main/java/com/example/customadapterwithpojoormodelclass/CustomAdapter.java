package com.example.customadapterwithpojoormodelclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;

    public CustomAdapter(Context ctct, ArrayList<Item> al) {
        this.ctct = ctct;
        this.al = al;
    }

    private Context ctct;
    private ArrayList<Item> al;

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return al.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View rv, ViewGroup viewGroup) {

        ViewHolder vH;
        if (rv == null) {

            rv = LayoutInflater.from(ctct).inflate(R.layout.customlayoutdesign,null,false);

            vH = new ViewHolder(rv);

            rv.setTag(vH);
        }

        else {
            vH = (ViewHolder) rv.getTag();
        }
        Item currentItem = (Item) getItem(i);

        vH.Name.setText(currentItem.getItemNames());
        vH.description.setText(currentItem.getItemDescriptions());

        return rv;
    }

        private  class ViewHolder {

            TextView Name;
            TextView description;
            public ViewHolder(View view) {

                Name = view.findViewById(R.id.tv1);
                description = view.findViewById(R.id.tv2);
            }
        }
}
