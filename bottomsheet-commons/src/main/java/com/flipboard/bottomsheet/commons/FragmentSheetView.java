package com.flipboard.bottomsheet.commons;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.widget.FrameLayout;

import flipboard.bottomsheet.commons.R;

@SuppressLint("ViewConstructor")
public class FragmentSheetView extends FrameLayout{

    /**
     * @param context Context to construct view with
     * @param fm FragmentManager perform the transaction
     * @param fragment Fragment to insert
     */
    public FragmentSheetView(Context context, FragmentManager fm, Fragment fragment) {
        super(context);
        inflate(context, R.layout.fragment_sheet_view, this);
        fm.beginTransaction()
                .add(R.id.content, fragment)
                .commit();
    }


}
