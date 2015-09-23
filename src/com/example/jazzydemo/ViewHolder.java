package com.example.jazzydemo;

import android.util.SparseArray;
import android.view.View;

/**
 * ListView���湤����
 * 
 * @author luming
 * @date 2015-4-23
 * @Copyright: 2015 Shenzhen xianpu Technology All rights reserved.
 */
public class ViewHolder {

	/**
	 * ImageView view = ViewHolder.get(convertView, R.id.imageView);
	 * 
	 * ͨ��ID��ȡListView��Ӧ��item
	 * 
	 * @param view
	 *            convertView
	 * @param id
	 *            item.R.Id
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "hiding" })
	public static <T extends View> T get(View view, int id) {
		// ���HashMap<Integer, E>��SparseArray<E>��������и�������
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
	 * ͨ��ID��ȡListView��Ӧ��item
	 * 
	 * @param view
	 *            convertView
	 * @param id
	 *            item.R.Id
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "hiding" })
	public static <T extends View> T get(View view, int id, int position) {
		// ���HashMap<Integer, E>��SparseArray<E>��������и�������
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

