package com.anzelmas.lkl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.anzelmas.lkl.fragments.KomandosFragment;
import com.anzelmas.lkl.fragments.LenteleFragment;
import com.anzelmas.lkl.fragments.NaujienosFragment;
import com.anzelmas.lkl.fragments.RezultataiFragment;
import com.anzelmas.lkl.fragments.TvarkarastisFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private NaujienosFragment naujienosFragment;
    private KomandosFragment komandosFragment;
    private TvarkarastisFragment tvarkarastisFragment;
    private RezultataiFragment rezultataiFragment;
    private LenteleFragment lenteleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        naujienosFragment = new NaujienosFragment();
        komandosFragment = new KomandosFragment();
        tvarkarastisFragment = new TvarkarastisFragment();
        rezultataiFragment = new RezultataiFragment();
        lenteleFragment = new LenteleFragment();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(naujienosFragment, "Naujienos");
        viewPagerAdapter.addFragment(komandosFragment, "Komandos");
        viewPagerAdapter.addFragment(tvarkarastisFragment, "Tvarkaraštis");
        viewPagerAdapter.addFragment(rezultataiFragment, "Rezultatai");
        viewPagerAdapter.addFragment(lenteleFragment, "Lentelė");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_news_white_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_teams_white_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_schedule_white_24);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_results_white_24);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_table_white_24);

        BadgeDrawable badgeDrawable = tabLayout.getTabAt(3).getOrCreateBadge();
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(12);

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
