package com.woozzu.android.indexablelistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.woozzu.android.widget.IndexableAdapter;

import java.util.ArrayList;

/**
 * Created by Fran on 09/01/2015.
 */
public class ContentAdapter<T> extends IndexableAdapter {

    private ArrayList<T> mItems;

    public ContentAdapter(ArrayList<T> mItems) {
        this.mItems = mItems;
    }

    @Override
    public String getItemString(int position) {
        return mItems.get(position).toString();
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        }
        ((TextView)view).setText(getItemString(i));
        return view;
    }
}
