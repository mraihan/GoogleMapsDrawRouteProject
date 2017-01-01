package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rian on 01-Jan-17.
 */
public class LineInfoShow extends Activity{

    TextView lineinfoshowtext;
    Button closelineinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineinfoshow);

        lineinfoshowtext = (TextView) findViewById(R.id.lineinfoshowtext);
        closelineinfo = (Button) findViewById(R.id.closelineinfo);

        Intent intent = getIntent();

        String name = intent.getStringExtra("linename");
        String addr = intent.getStringExtra("lineaddr");
        String mob = intent.getStringExtra("linemob");


        lineinfoshowtext.setText("Name: "+name+"\nAddress: "+addr+"\nMobile: "+mob);

        closelineinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LineInfoShow.this.finish();
                //ActivityCompat.finishAffinity(Information.this);




            }
        });



    }
}
