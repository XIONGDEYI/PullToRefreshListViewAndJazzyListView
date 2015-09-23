package com.example.jazzydemo;

import android.util.SparseArray;
import android.view.View;

/**
 * ListView缓存工具类
 * 
 * @author luming
 * @date 2015-4-23
 * @Copyright: 2015 Shenzhen xianpu Technology All rights reserved.
 */
public class ViewHolder {

	/**
	 * ImageView view = ViewHolder.get(convertView, R.id.imageView);
	 * 
	 * 通过ID获取ListView对应的item
	 * 
	 * @param view
	 *            convertView
	 * @param id
	 *            item.R.Id
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "hiding" })
	public static <T extends View> T get(View view, int id) {
		// 针对HashMap<Integer, E>用SparseArray<E>来代替会有更好性能
		SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
		if (viewHolder == null) {
			viewHolder = new SparseArray<View>();
			view.setTag(viewHolder);
		}
		View childView = viewHolder.get(id);
		if (childView == null) {
			childView = view.findViewById(id);
			viewHolder.put(id, childView);
		}
		return (T) childView;
	}

	/**
	 * ImageView view = ViewHolder.get(convertView, R.id.imageView);
	 * 
	 * 通过ID获取ListView对应的item
	 * 
	 * @param view
	 *            convertView
	 * @param id
	 *            item.R.Id
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "hiding" })
	public static <T extends View> T get(View view, int id, int position) {
		// 针对HashMap<Integer, E>用SparseArray<E>来代替会有更好性能
		SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
		if (viewHolder == null) {
			viewHolder = new SparseArray<View>();
			view.setTag(viewHolder);
		}
		View childView = viewHolder.get(position);
		if (childView == null) {
			childView = view.findViewById(id);
			viewHolder.put(position, childView);
		}
		return (T) childView;
	}
}

