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
 * Created by Rian on 01-Jan-17.
 */
public class LineInfoShow extends Activity{



    SharedPreferences sharedPreferences;

    TextView lineinfoshowtext;
    Button closelineinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineinfoshow);

        lineinfoshowtext = (TextView) findViewById(R.id.lineinfoshowtext);
        closelineinfo = (Button) findViewById(R.id.closelineinfo);


        Intent intent = getIntent();

        // School Data Begin

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        String lineinformation = sharedPreferences.getString("lineinformation", "");





        lineinfoshowtext.setText("Line Inforation : "+lineinformation);

        closelineinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();



            }
        });



    }
}
