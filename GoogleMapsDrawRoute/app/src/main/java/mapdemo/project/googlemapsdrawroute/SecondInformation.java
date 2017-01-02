package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rian on 01-Jan-17.
 */

public class SecondInformation extends Activity {

    Button savesecond,closesecond;
    EditText editTextNamesecond,editTextAddresssecond,editTextMobilesecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondinformation);


        savesecond = (Button) findViewById(R.id.savesecond);
        closesecond = (Button) findViewById(R.id.savesecond);
        editTextNamesecond = (EditText) findViewById(R.id.editTextNamesecond);
        editTextAddresssecond = (EditText) findViewById(R.id.editTextAddresssecond);
        editTextMobilesecond = (EditText) findViewById(R.id.editTextMobilesecond);


        savesecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(SecondInformation.this,SecondInformationShow.class);

                in.putExtra("sname", editTextNamesecond.getText().toString());
                in.putExtra("saddr", editTextAddresssecond.getText().toString());
                in.putExtra("smob", editTextMobilesecond.getText().toString());
                Toast.makeText(getApplicationContext(), "Saved !!", Toast.LENGTH_LONG).show();
                startActivity(in);


            }
        });

        closesecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();




            }
        });

    }

}
