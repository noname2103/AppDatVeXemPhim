package com.dxt.xuantruong.appdatvexemphim;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class PhimAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<Phim> phimList;

    public PhimAdapter(Context context, int layout, List<Phim> phimList) {
        this.context = context;
        this.layout = layout;
        this.phimList= phimList;
    }

    @Override
    public int getCount() {
        return phimList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    public class ViewHolder{
        TextView txtTenphim;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null)
        {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            holder.txtTenphim =(TextView) convertView.findViewById(R.id.txtTenphim);
            convertView.setTag(holder);

        }else
        {
            holder = (ViewHolder) convertView.getTag();

        }
        Phim phim   = phimList.get(position);
        holder.txtTenphim.setText(phim.getTenPhim());

        return convertView;
    }
}
