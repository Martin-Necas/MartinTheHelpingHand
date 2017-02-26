package cz.sspbrno.marti.martinthehelpinghand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void RegBack(View view) {
        Intent Main = new Intent(this,MainActivity2.class);
        startActivity(Main);
    }
}
