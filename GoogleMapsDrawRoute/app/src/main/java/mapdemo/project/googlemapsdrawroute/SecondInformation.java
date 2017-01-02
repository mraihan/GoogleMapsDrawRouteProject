package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rian on 01-Jan-17.
 */

public class SecondInformation extends Activity {

    SharedPreferences sharedPreferences;

    Button savesecond,closesecond;
    EditText editTextNamesecond,editTextAddresssecond,editTextMobilesecond,editTextLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondinformation);


        savesecond = (Button) findViewById(R.id.savesecond);
        closesecond = (Button) findViewById(R.id.savesecond);
        editTextNamesecond = (EditText) findViewById(R.id.editTextNamesecond);
        editTextAddresssecond = (EditText) findViewById(R.id.editTextAddresssecond);
        editTextMobilesecond = (EditText) findViewById(R.id.editTextMobilesecond);

        editTextLine = (EditText) findViewById(R.id.editTextMobilesecond);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);






        savesecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("sname", editTextNamesecond.getText().toString());
                editor.putString("saddr", editTextAddresssecond.getText().toString());
                editor.putString("smob", editTextMobilesecond.getText().toString());


                editor.putString("lineinformation", editTextLine.getText().toString().trim());
                editor.commit();

                Toast.makeText(getApplicationContext(), "Saved !!", Toast.LENGTH_LONG).show();

                Intent in = new Intent(SecondInformation.this,SecondInformationShow.class);

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
