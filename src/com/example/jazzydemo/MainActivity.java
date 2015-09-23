package com.example.jazzydemo;

import java.util.ArrayList;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.xp.lvbh.others.jazzylistview.JazzyListView;
import com.xp.lvbh.others.jazzylistview.effects.GrowEffect;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

	private ListViewAdapter adapter;
	private ArrayList<String> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		JazzyListView listview = (JazzyListView)findViewById(R.id.jazzylistview_list);
		PullToRefreshListView pull_listview = (PullToRefreshListView)findViewById(R.id.pulltorefresh_list);
		pull_listview.setMode(Mode.BOTH);
		
		list = new ArrayList<String>();
		for (int i = 0; i <20; i++) {
			list.add(i + "实际效果展示实际效果展示实际效果展示实际效果展示");
		}
		adapter = new ListViewAdapter(this, list);
		
		listview.setAdapter(adapter);
		pull_listview.setAdapter(adapter);
		
		pull_listview.setTransitionEffect(new GrowEffect());
//		listview.setTransitionEffect(new SlideInEffect());
		listview.setTransitionEffect(new GrowEffect());
	}

}
