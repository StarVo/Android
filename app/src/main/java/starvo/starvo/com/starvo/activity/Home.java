package starvo.starvo.com.starvo.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import starvo.starvo.com.starvo.R;
import starvo.starvo.com.starvo.fragment.FragmentSettings;
import starvo.starvo.com.starvo.util.BottomNavigationViewHelper;

public class Home extends AppCompatActivity {

    FragmentManager fragmentManager;
    Fragment fragmentSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fragmentManager = getSupportFragmentManager();

        // Setup tab menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.main_menu);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.menu_home);
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return changeTab(item.getItemId());
        }

    };

    public boolean changeTab(int menuId) {
        Fragment fragment = null;
        int titleResId = 0;

        switch (menuId) {
            case R.id.menu_home:
                if (fragmentSettings == null)
                    fragmentSettings = new FragmentSettings();
                fragment = fragmentSettings;
                break;
            /*case R.id.navigation_home:
                if (fragmentHome == null)
                    fragmentHome = new FragmentHome();
                fragment = fragmentHome;
                titleResId = R.string.menu_main_home;
                break;
            case R.id.navigation_activity:
                if (fragmentTransactionList == null)
                    fragmentTransactionList = new FragmentTransactionList();
                fragment = fragmentTransactionList;
                titleResId = R.string.menu_main_activity;
                break;
            case R.id.navigation_send:
                if (fragmentSend == null)
                    fragmentSend = new FragmentSend();
                fragment = fragmentSend;
                titleResId = R.string.menu_main_send;
                break;
            case R.id.navigation_request:
                if (fragmentRequest == null)
                    fragmentRequest = new FragmentRequest();
                fragment = fragmentRequest;
                titleResId = R.string.menu_main_request;
                break;
            case R.id.navigation_settings:
                if (fragmentSettings == null)
                    fragmentSettings = new FragmentSettings();
                fragment = fragmentSettings;
                titleResId = R.string.menu_main_settings;
                break;*/
            default:
                return false;
        }

        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentHolder, fragment).commit();
        //title.setText(titleResId);
        return true;
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_home, container, false);
            /*TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));*/
            return rootView;
        }
    }

}
