package exemplo.com.appcorsan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView txtView = (TextView) findViewById(R.id.editText);

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + " A");
            }
        });
    }
}
