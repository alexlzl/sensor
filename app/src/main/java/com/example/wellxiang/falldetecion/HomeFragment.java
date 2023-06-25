package com.example.wellxiang.falldetecion;

import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
//import com.suke.widget.SwitchButton;


/**
 * Created by LiuWeixiang on 2017/2/22.
 */
public class HomeFragment extends Fragment {

//    private SwitchButton switchButton;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
//        switchButton = (SwitchButton) view.findViewById(R.id.switchButton);
//        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                if(view.isChecked()){
//                    Intent startIntent = new Intent(getContext(), FallDetectionService.class);
//                    getContext().startService(startIntent);
//                }else{
//                    Intent stopIntent = new Intent(getContext(), FallDetectionService.class);
//                    getContext().stopService(stopIntent);
//                }
//            }
//        });
        Intent startIntent = new Intent(getContext(), FallDetectionService.class);
        getContext().startService(startIntent);
        return view;
    }

}
