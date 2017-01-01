package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rian on 01-Jan-17.
 */

public class SecondInformation extends Activity {

    Button savesecond,close;
    EditText editTextNamesecond,editTextAddresssecond,editTextMobilesecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondinformation);


        savesecond = (Button) findViewById(R.id.savesecond);
        editTextNamesecond = (EditText) findViewById(R.id.editTextNamesecond);
        editTextAddresssecond = (EditText) findViewById(R.id.editTextAddresssecond);
        editTextMobilesecond = (EditText) findViewById(R.id.editTextMobilesecond);


        savesecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(SecondInformation.this,LineInfoShow.class);

                in.putExtra("linename", editTextNamesecond.getText().toString());
                in.putExtra("lineaddr", editTextAddresssecond.getText().toString());
                in.putExtra("linemob", editTextMobilesecond.getText().toString());

                startActivity(in);


            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondInformation.this.finish();
                //ActivityCompat.finishAffinity(Information.this);




            }
        });

    }

}
