package cz.sspbrno.marti.martinthehelpinghand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ListView buttons = (ListView) findViewById(R.id.listView1);
        ArrayList<String> items = new ArrayList<String>();
        items.add(String.valueOf("Prining"));
        items.add(String.valueOf("Light"));
        items.add(String.valueOf("Recycling"));
        buttons.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1,items));



    }

}
