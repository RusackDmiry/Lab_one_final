package com.kamieshi.lab_one_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++)
        {
            Log.d("MainActivity","Counter"+count);
        }
        hz();
    }

    private void hz() {
        TextFunction ntf = new TextFunction();
        TextView nv = (TextView) findViewById(R.id.Newtext);
        nv.setText(ntf.getValue());
    }
}
