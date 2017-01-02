package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rian on 02-Jan-17.
 */

public class SecondInformationShow extends Activity {
    SharedPreferences sharedPreferences;

    TextView secondinfoshowtext;
    Button  closesecondinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondinfoshow);

        secondinfoshowtext = (TextView) findViewById(R.id.secondinfoshowtext);

        closesecondinfo = (Button) findViewById(R.id.closesecondinfo);

        Intent intent = getIntent();



        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        String name = sharedPreferences.getString("sname","");
        String addr = sharedPreferences.getString("saddr","");
        String mob = sharedPreferences.getString("smob","");


        secondinfoshowtext.setText("Name: "+name+"\nAddress: "+addr+"\nMobile: "+mob);

        closesecondinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();



            }
        });

    }
}
