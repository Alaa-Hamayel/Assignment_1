package com.example.alaa.project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class project1 extends ActionBarActivity {
    Random RandNum = new Random();
    int UserInput;
    int Number = RandNum.nextInt(1000);
    EditText Num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_project1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Gess() {

        Num = (EditText) findViewById(R.id.editText);
        UserInput = Integer.parseInt(Num.getText().toString());
        TextView res = (TextView) findViewById(R.id.textView3);


        // res.setText(null);



            // Button Button1 = (Button) findViewById(R.id.button);


            if (UserInput == Number) {
                res.setText(UserInput + " is True : You Win");
            } else if (UserInput - Number < 5 && UserInput - Number > 0) {
                Num.setText(null);
                res.setText(UserInput + " Very Close");

            } else if (Number - UserInput < 5 && Number - UserInput > 0) {
                Num.setText(null);
                res.setText(UserInput + " Very Close");

            } else if (UserInput > Number) {
                Num.setText(null);
                res.setText(UserInput + " is Greater");

            } else if (UserInput < Number) {
                Num.setText(null);
                res.setText(UserInput + " is Smaller");
            }






    }
    public void Submit (View view) {
        Num = (EditText)findViewById(R.id.editText);
        UserInput = Integer.parseInt(Num.getText().toString());
        if (UserInput >1000 || UserInput <0){
            Toast toast = Toast.makeText(getApplicationContext(),"This Number is Greater than 1000", Toast.LENGTH_LONG);
            toast.show();
        }else {


            Gess();
        }
    }



}


