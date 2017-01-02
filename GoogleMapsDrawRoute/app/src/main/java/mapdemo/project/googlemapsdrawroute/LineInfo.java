package mapdemo.project.googlemapsdrawroute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rian on 02-Jan-17.
 */

public class LineInfo extends Activity {

    Button saveline, closeline;
    EditText editTextNameline, editTextAddressline, editTextMobileline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineinfo);


        saveline = (Button) findViewById(R.id.saveline);
        closeline = (Button) findViewById(R.id.closeline);
        editTextNameline = (EditText) findViewById(R.id.editTextNameline);
        editTextAddressline = (EditText) findViewById(R.id.editTextAddressline);
        editTextMobileline = (EditText) findViewById(R.id.editTextMobileline);


        saveline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(LineInfo.this, LineInfoShow.class);

                in.putExtra("linename", editTextNameline.getText().toString());
                in.putExtra("lineaddr", editTextAddressline.getText().toString());
                in.putExtra("linemob", editTextMobileline.getText().toString());
                Toast.makeText(getApplicationContext(), "Saved !!", Toast.LENGTH_LONG).show();
                startActivity(in);


            }
        });

        closeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();


            }
        });

    }
}
