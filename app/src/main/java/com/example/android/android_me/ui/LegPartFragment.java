/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class LegPartFragment extends Fragment {

    private List<Integer> mImageIds;
    private int mListIndex;

    public LegPartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.leg_image_view);

        if(mImageIds!=null)
        {
            imageView.setImageResource(mImageIds.get(mListIndex));
        }
        else
        {
            Log.v("Null List","This fragment has null list");
        }
        return rootView;
    }


    public void setImageIds(List<Integer> imageIds)
    {
        mImageIds=imageIds;
    }

    public void setListIndex(int index)
    {
        mListIndex=index;
    }


}
