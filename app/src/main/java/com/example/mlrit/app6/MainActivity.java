package com.example.mlrit.app6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button)findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                String s3 = et3.getText().toString();

                if (s1.equals(" ")) {
                    et1.setError("enter name");
                    Toast.makeText(MainActivity.this, " NotRegistered", Toast.LENGTH_LONG).show();
                }
                else
                    if (s2.equals(" ")){
                        et2.setError("enter emailid");
                    Toast.makeText(MainActivity.this, " NotRegistered", Toast.LENGTH_LONG).show();
                }
                else
                    if (s3.equals(" ")){
                        et3.setError("mobileno");
                Toast.makeText(MainActivity.this, " NotRegistered", Toast.LENGTH_LONG).show();}
                    else
                        Toast.makeText(MainActivity.this, "Registered", Toast.LENGTH_LONG).show();
                }

        });
    }
}
