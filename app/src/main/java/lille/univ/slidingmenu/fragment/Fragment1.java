package lille.univ.slidingmenu.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lille.univ.slidingmenu.R;


public class Fragment1 extends android.app.Fragment {

    public Fragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment1, container, false);
            return rootView;
    }


}

