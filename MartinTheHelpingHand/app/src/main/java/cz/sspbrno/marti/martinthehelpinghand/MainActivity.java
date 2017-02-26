package cz.sspbrno.marti.martinthehelpinghand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       }

    public void login(View view) {
        Intent Main = new Intent(this,MainActivity2.class);
        startActivity(Main);

    }

    public void reg(View view) {
        Intent reg = new Intent(this,Reg.class);
        startActivity(reg);

    }
}
