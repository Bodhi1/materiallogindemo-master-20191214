package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StatsMonthNine extends AppCompatActivity {

    String[] CategoryList = {"表9-1　維護海域海岸資源統計—按月份分", "表9-1　維護海域海岸資源統計—按月份分(續1)"
            , "表9-2　維護海域海岸資源統計—按單位分", "表9-2　維護海域海岸資源統計—按單位分(續1)", "表9-2　維護海域海岸資源統計—按單位分(續2)"
            ,"表9-2　維護海域海岸資源統計—按單位分(續3)","表9-3　維護海域海岸資源統計—按縣市分","表9-3　維護海域海岸資源統計—按縣市分(續1)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_month_nine);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CategoryList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView textView= view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.WHITE);
                return view;
            }
        };

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1KkyyEoJTfDTagORT73_u41Sc80m2-Nb7/preview");
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1O8Kzr5V3C03A4-NRvUovMJZaXVLN0-Ms/preview");
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1PABnr9-xUNklb8TRvWzyOyKu05EFOcpX/preview");
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zAV0sqd7ulBpidKCHgfbN2xq7lr1gI_7/preview");
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xlnJjEDGsvQPE6xTAQVZgYojxfTkwhY9/preview");
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Fql5Dz-M8CjGLboa2IPMYPKSx2Q8kZhy/preview");
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1BIrLxRO2hxGg7bx5nnVuIW3I6egHUpxp/preview");
                    startActivity(intent);
                }
                else if (position==7){
                    Intent intent=new Intent(StatsMonthNine.this,WebViewActivity.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1uu7y5zk_peEvgQ4s9IhwIFDtFZNjzEeT/preview");
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.stats_month9);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        } else if (id == R.id.logout) {
            GlobalVariable gv = (GlobalVariable) getApplicationContext();
            gv.setLoginToken(false);
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
