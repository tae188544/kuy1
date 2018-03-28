package sdu.cs58.jatuporn.trafficesignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 37-SDU on 3/28/2018.
 */
//class ทำหน้าที่สร้าง layout เพื่อนำเสนอหน้า mainactivity
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings,detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {//นับจำนวนใน Array แล้วส่งข้อมูล method getview
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//รับข้อมูลจาก getCount()มาแสดงผล
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //ผูกตัวแปรบนjava  กับอิลิเมนท์บน xml ที่หน้า mt_listView
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

         imageView.setImageResource(ints[i]);
         titleTextView.setText(titleStrings[i]);
         detailTextView.setText(detailStrings[i]);
        return view1;
    }
}//end class
