package com.mobile.diyalarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    private List<model> modellist = null;
    private ArrayList<model> modelarraylist;


    public ListViewAdapter(Context context, List<model> modellist) {
        this.context = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(context);
        this.modelarraylist = new ArrayList<model>();
        this.modelarraylist.addAll(this.modellist);
    }
    public class ViewHolder {
        TextView state;
        TextView date;

      }
    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if(view ==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.list_item, null);
            holder.state = (TextView) view.findViewById(R.id.stat);
            holder.date = (TextView) view.findViewById(R.id.date);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        holder.state.setText(modellist.get(i).getState());
        holder.date.setText(modellist.get(i).getDate().toString());

        return view;
    }
}
