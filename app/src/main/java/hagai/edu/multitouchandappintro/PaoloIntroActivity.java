package hagai.edu.multitouchandappintro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public class PaoloIntroActivity extends com.github.paolorotolo.appintro.AppIntro {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        addSlide(com.github.paolorotolo.appintro.AppIntro.AppIntroFragment.newInstance(""));
        addSlide(hagai.edu.multitouchandappintro.appintro.AppIntroFragment.newInstance(0));
        addSlide(hagai.edu.multitouchandappintro.appintro.AppIntroFragment.newInstance(1));
        addSlide(hagai.edu.multitouchandappintro.appintro.AppIntroFragment.newInstance(2));
        addSlide(hagai.edu.multitouchandappintro.appintro.AppIntroFragment.newInstance(3));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
//        super.onSkipPressed(currentFragment);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
    }
    private  void  gotoMain (){
        SharedPreferences prefs = getSharedPreferences("appIntroduction", MODE_PRIVATE);
        SharedPreferences.Editor editor= prefs.edit();
        editor.putBoolean("should show Intro" , false);
        editor.commit();

        Intent intent = new Intent(this , PaoloIntroActivity.class);
        startActivity(intent);
        finish();

    }
}
