package exemplo.com.aula7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference databaseReference;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FireData.getDatabase();

        databaseReference = database.getReference("/results");

        textView = (TextView) findViewById(R.id.textView);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data: dataSnapshot.getChildren()){
                    Usuario usu = data.getValue(Usuario.class);
                    textView.setText(textView.getText() + usu.getEmail());
                }

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });
        createNewFragment();
    }


    private void createNewFragment(){
        FragmentView fragmentView = new FragmentView();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentContainer,fragmentView);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
