package exemplo.com.appcorsan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import exemplo.com.appcorsan.exemplo.com.appcorsan.entity.Usuario;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button btn = (Button) findViewById(R.id.button);
        final TextView txt = (TextView) findViewById(R.id.editTextUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this.getBaseContext(), IndexActivity.class);

                Usuario usuario = new Usuario();
                usuario.setUsuario(txt.getText().toString());

                String strJson = new Gson().toJson(usuario);

                i.putExtra("usuarioJson", strJson);
                startActivity(i);
            }
        });
    }
}
