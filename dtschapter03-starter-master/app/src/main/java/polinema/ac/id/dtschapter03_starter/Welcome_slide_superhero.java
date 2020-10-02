package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome_slide_superhero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(Welcome_slide_superhero.this, Slide_assign.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(Welcome_slide_superhero.this, Welcome_back.class);
        startActivity(i);
    }
}