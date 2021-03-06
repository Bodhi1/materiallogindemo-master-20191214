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

public class CgaRegulationsActivity extends AppCompatActivity {

    ListView simpleList;
    String[] CategoryList = {"法律", "命令", "行政規則"};
    int[] flags = {R.drawable.alt01, R.drawable.alt02, R.drawable.alt03};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cga_regulations);

        simpleList = (ListView) findViewById(R.id.cga_regulations);
        CategoryAdapter categoryAdapter = new CategoryAdapter(getApplicationContext(), CategoryList, flags);
        simpleList.setAdapter(categoryAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView listView, View itemView, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(CgaRegulationsActivity.this,CgaLawActivity.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent=new Intent(CgaRegulationsActivity.this,CgaCommandsActivity.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent=new Intent(CgaRegulationsActivity.this,CgaAdminRulesActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview = findViewById(R.id.cga_regulations);
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
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
        else if (id==R.id.logout){
            GlobalVariable gv=(GlobalVariable)getApplicationContext();
            gv.setLoginToken(false);
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
