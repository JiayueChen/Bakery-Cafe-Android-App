package com.example.keai.bake;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {
    // Declare the View variable and assign the View from the variable
    private EditText editText;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

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

    //the sign up button make a toast message
    public void signup(View view) {
        if(editText.getText().equals(null) || editText.getText().length() == 0 || editText2.getText().equals(null) || editText2.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "The Email or Password cannot be empty",
                    Toast.LENGTH_SHORT).show();
        }


        else Toast.makeText(getApplicationContext(), "Welcome to Backery",
                Toast.LENGTH_SHORT).show();


    }

    //the log in button make a toast message
    public void login(View view) {
        if(editText.getText().equals(null) || editText.getText().length() == 0 || editText2.getText().equals(null) || editText2.getText().length() == 0){

            Toast.makeText(getApplicationContext(), "The Email or Password cannot be empty",
                    Toast.LENGTH_SHORT).show();
        }



        else Toast.makeText(getApplicationContext(), "You have Login",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
