package com.example.keai.bake;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        SharedPreferences sp = getSharedPreferences("your_prefs", MenuActivity.MODE_PRIVATE);
//        int total = sp.getInt("int_key", 0);

    }

    //add one order each time when we click the item of the dish, and show the total number of this dish
    public void list_item1(View view) {
        a++;
        Toast.makeText(getApplicationContext(), "You have ordered Macaron: " + Integer.toString(a),
                Toast.LENGTH_SHORT).show();
    }

    public void list_item2(View view) {
        b++;
        Toast.makeText(getApplicationContext(), "You have ordered Triple-Chocolete Mouse Cake: " + Integer.toString(b),
                Toast.LENGTH_SHORT).show();
    }

    public void list_item3(View view) {
        c++;
        Toast.makeText(getApplicationContext(), "You have ordered Pumpkin Cupcake: " + Integer.toString(c),
                Toast.LENGTH_SHORT).show();
    }

    public void list_item4(View view) {
        d++;
        Toast.makeText(getApplicationContext(), "You have ordered Rice Pudding: " + Integer.toString(d),
                Toast.LENGTH_SHORT).show();
    }

    //show the total number of order
    public void order(View view) {
        total=a+b+c+d;
        Toast.makeText(getApplicationContext(), "You have ordered: " + Integer.toString(total),
                Toast.LENGTH_SHORT).show();
    }


    //link to facebook web page when click the icon of facebook
    public void link_facebook(View view) {
        String url = "http://www.facebook.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //link to pinterest web page when click the icon of pinterest
    public void link_pinterest(View view) {
        String url = "https://www.pinterest.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //link to twitter web page when click the icon of twitter
    public void link_twitter(View view) {
        String url = "https://www.twitter.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //the left arrow on the action bar can link to the MainActivity page
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
