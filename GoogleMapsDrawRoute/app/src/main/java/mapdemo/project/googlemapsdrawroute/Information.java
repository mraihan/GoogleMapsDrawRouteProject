package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Raihan on 24-Dec-16.
 */
public class Information extends Activity {

    Button save,close;
    EditText editTextName,editTextAddress,editTextMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);


        save = (Button) findViewById(R.id.save);
        close  = (Button) findViewById(R.id.close);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(Information.this,Show.class);

                in.putExtra("name", editTextName.getText().toString());
                in.putExtra("addr", editTextAddress.getText().toString());
                in.putExtra("mob", editTextMobile.getText().toString());
                Toast.makeText(getApplicationContext(), "Saved !!", Toast.LENGTH_LONG).show();
                startActivity(in);


            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();




            }
        });

    }
}
