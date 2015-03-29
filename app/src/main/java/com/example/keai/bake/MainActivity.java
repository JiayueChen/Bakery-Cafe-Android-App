package com.example.keai.bake;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }
    //add a Toast message when click the button 'Calculator'
    public void calculator(View view){
        Toast.makeText(getApplicationContext(), "You have ordered 3 items",
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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();



        //click INFO button on the action bar to jump to InfoActivity page
        if (id == R.id.Info) {
            startActivity(new Intent(this, InfoActivity.class));
        }

        //click MENU button on the action bar to jump to MenuActivity page
        if (id == R.id.Menu) {
            startActivity(new Intent(this, MenuActivity.class));
        }

        //click LOGIN button on the action bar to jump to LoginActivity page
        if (id == R.id.Login) {
            startActivity(new Intent(this, LoginActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }


}
