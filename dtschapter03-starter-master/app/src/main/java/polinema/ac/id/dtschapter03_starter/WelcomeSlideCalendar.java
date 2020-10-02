package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calendar);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, Welcome_slide_superhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, Welcome_back.class);
        startActivity(i);
    }
}