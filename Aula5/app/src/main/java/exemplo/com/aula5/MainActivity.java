package exemplo.com.aula5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<ListItem> listaItems = new ArrayList<ListItem>();

        //public ListItem(int avatarID, int imgID, String name, String local, String likes) {
        listaItems.add(new ListItem(R.mipmap.ic_launcher,R.drawable.ic_action_overflow,"Nome1","Local","likes"));
        listaItems.add(new ListItem(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Nome2","Local123","likes"));
        listaItems.add(new ListItem(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Nome3","Local14134","likes"));
        listaItems.add(new ListItem(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Nome4","Local456746746","likes"));

        CustomAdapter adapter = new CustomAdapter(getBaseContext(),listaItems);

        listView.setAdapter(adapter);

    }
}
