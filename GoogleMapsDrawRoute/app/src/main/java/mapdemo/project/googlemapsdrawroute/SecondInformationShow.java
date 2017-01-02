package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rian on 02-Jan-17.
 */

public class SecondInformationShow extends Activity {

    TextView secondinfoshowtext;
    Button  closesecondinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondinfoshow);

        secondinfoshowtext = (TextView) findViewById(R.id.secondinfoshowtext);

        closesecondinfo = (Button) findViewById(R.id.closesecondinfo);

        Intent intent = getIntent();

        String name = intent.getStringExtra("sname");
        String addr = intent.getStringExtra("saddr");
        String mob = intent.getStringExtra("smob");


        secondinfoshowtext.setText("Name: "+name+"\nAddress: "+addr+"\nMobile: "+mob);

        closesecondinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();



            }
        });

    }
}
