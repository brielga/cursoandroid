package exemplo.com.appcorsan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import exemplo.com.appcorsan.exemplo.com.appcorsan.entity.Usuario;

public class IndexActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        textView = (TextView) findViewById(R.id.editText7);

        String str = getIntent().getStringExtra("usuarioJson");

        Usuario u = new Gson().fromJson(str, Usuario.class);

        textView.setText("Olá " + u.getUsuario());

    }
}
