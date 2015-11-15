package com.example.gamerz.cutomlistviewtest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] username;
	private final Integer[] prof_id;
    private final String[] prof_name;
	
	public CustomListAdapter(Activity context, String[] username, Integer[] prof_id,String[] prof_name) {
		super(context, R.layout.customlist, username);
		// TODO Auto-generated constructor stub
		this.prof_name =prof_name;
		this.context=context;
		this.username=username;
		this.prof_id=prof_id;
	}
	
	public View getView(int position,View view,ViewGroup parent) {
		LayoutInflater inflater=context.getLayoutInflater();
		View rowView=inflater.inflate(R.layout.customlist, null,true);
		
		TextView nameTitle = (TextView) rowView.findViewById(R.id.name);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.profile);
		TextView pnametitle = (TextView) rowView.findViewById(R.id.idname);
        ImageView imageView_down = 	(ImageView) rowView.findViewById(R.id.gallery);
        nameTitle.setText(username[position]);
		imageView.setImageResource(prof_id[position]);
        pnametitle.setText(prof_name[position]);
        imageView_down.setImageResource(prof_id[position]);
		return rowView;
		
	};
}
