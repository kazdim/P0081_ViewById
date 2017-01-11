package ua.dk.p0081_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("Android is cool!");

        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setText("My first button");
        myButton.setEnabled(false);

        CheckBox myChk = (CheckBox) findViewById(R.id.myChk);
        myChk.setChecked(true);
    }
}
