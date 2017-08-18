package hagai.edu.multitouchandappintro.appintro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {


//Constructor
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return AppIntroFragment.newInstance(position);
    }

//how many fragments?
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

}