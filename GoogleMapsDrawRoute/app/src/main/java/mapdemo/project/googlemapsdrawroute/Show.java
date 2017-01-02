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

    TextView firstinfotextshow;
    Button closfirstinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        firstinfotextshow = (TextView) findViewById(R.id.firstinfotextshow);
        closfirstinfo = (Button) findViewById(R.id.closfirstinfo);
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String addr = intent.getStringExtra("addr");
        String mob = intent.getStringExtra("mob");


        firstinfotextshow.setText("Name: "+name+"\nAddress: "+addr+"\nMobile: "+mob);

        closfirstinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();



            }
        });


    }
}
