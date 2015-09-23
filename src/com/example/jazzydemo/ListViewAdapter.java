package com.example.jazzydemo;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<String> items;
	private LayoutInflater inflater;

	public ListViewAdapter(Context context, ArrayList<String> items) {
		super();
		this.context = context;
		this.items = items;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		if (null != items) {
			return items.size();
		}else{
			return 0;
		}
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final String item = items.get(position);
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item, null);
		}
		TextView txt_rank = ViewHolder.get(convertView, R.id.text);
		txt_rank.setText(item);
		return convertView;
	}
}
