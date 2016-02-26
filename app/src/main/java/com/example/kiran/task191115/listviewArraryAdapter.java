package com.example.kiran.task191115;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Kiran on 19-11-2015.
 */
public class listviewArraryAdapter extends Activity
{
    ListView lv;
    int[] im_name={R.drawable.ic_launcher,R.drawable.icon1,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,R.drawable.icon5,R.drawable.icon7};
    public String getMyLayoutLink()
    {
        return "lsdjflkasd";
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewdisplay);
        lv=(ListView)findViewById(R.id.LV_tag);
        customlistviewApply cla=new customlistviewApply(this);
        lv.setAdapter(cla);
    }
    class customlistviewApply extends BaseAdapter
    {
        Context context;
        LayoutInflater life;
        ImageView listiv;
        customlistviewApply(Context context)
        {
            this.context=context;
        }

        @Override
        public int getCount() {
            return im_name.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            life=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=life.inflate(R.layout.listviewstuff, null);
            listiv=(ImageView)convertView.findViewById(R.id.Iv_tag);
            listiv.setImageResource(im_name[position]);
            return convertView;
        }
    }
}
