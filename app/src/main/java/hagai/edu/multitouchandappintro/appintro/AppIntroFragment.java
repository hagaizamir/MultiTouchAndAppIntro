package hagai.edu.multitouchandappintro.appintro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import hagai.edu.multitouchandappintro.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppIntroFragment extends Fragment {


    public static AppIntroFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt("position" , position);
        AppIntroFragment fragment = new AppIntroFragment();
        fragment.setArguments(args);
        return  fragment;

    }
    //properties:
    private ImageView ivAppIntro;

    int [] imageResources = {
            R.drawable.app_intro1,
            R.drawable.app_intro2,
            R.drawable.app_intro3
    };

    public  int getImageSize (){
        return  imageResources.length;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_app_intro, container, false);

        ivAppIntro = v.findViewById(R.id.ivIntro);

        int position = getArguments().getInt("position");

        int imgResource = imageResources[position];

        ivAppIntro.setImageResource(imgResource);

        return  v;
    }

}
