package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Raihan on 26-Dec-16.
 */
public class Show extends Activity{

    TextView textViewShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        textViewShow = (TextView) findViewById(R.id.textViewShow);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String addr = intent.getStringExtra("addr");
        String mob = intent.getStringExtra("mob");


        textViewShow.setText("Name: "+name+"\nAddress: "+addr+"\nMobile: "+mob);

    }
}
