package com.lizhivscaomei.myapp.fragment_sun;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizhivscaomei.myapp.R;

/**
 * Created by 孙汉 on 2020-05-02/15/08
 */
public class MyFragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my1,container, false);
    }
}
