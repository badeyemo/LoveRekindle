package com.reconciliationhouse.android.loverekindle.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.reconciliationhouse.android.loverekindle.ui.explore.mediagallery.AllMediaFragment;
import com.reconciliationhouse.android.loverekindle.ui.explore.mediagallery.AudiosFragment;
import com.reconciliationhouse.android.loverekindle.ui.explore.mediagallery.EbooksFragment;

public class ExplorePagerAdapter extends FragmentStateAdapter {
    private final static String[] mFragmentTitleList = new String[]{
            "All", "Ebooks", "Audios"
    };

    public ExplorePagerAdapter(Fragment fragment) {
        super(fragment);
    }

    public static CharSequence getPageTitle(int position) {
        return mFragmentTitleList[position];
    }

    @Override
    public int getItemCount() {

        return 3;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position) {
            case 0:
                return new AllMediaFragment();
            case 1:
                return new EbooksFragment();
            case 2:
                return new AudiosFragment();
        }
        return null;
    }
}