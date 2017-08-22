package hagai.edu.multitouchandappintro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = getSharedPreferences("appIntroduction", MODE_PRIVATE);
        boolean shouldShowIntro = prefs.getBoolean("shouldShowIntro", true/*default*/);

        if (shouldShowIntro){
            Intent intent = new Intent(this,PaoloIntroActivity.class);
            startActivity(intent);
            finish();//kill main activity
        }
    }
}
