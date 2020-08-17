package com.example.dailyupdates.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.example.android.dailyupdates.R;
import com.example.dailyupdates.News;
import com.example.dailyupdates.NewsLoader;
import com.example.dailyupdates.NewsPreferences;


import java.util.List;

/**
 * The BusinessFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class BusinessFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = BusinessFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String businessUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.business));
        Log.e(LOG_TAG, businessUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(),businessUrl);
    }
}

