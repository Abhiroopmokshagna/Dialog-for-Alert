package com.mokshagna.abhiroop.dialogforalert;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View view) {
        AlertDialog.Builder myAlertBuilder= new AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Pressed OK",Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Pressed Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.show();
    }
}
