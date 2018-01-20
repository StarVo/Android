package starvo.starvo.com.starvo.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import starvo.starvo.com.starvo.R;


public class FragmentSettings extends Fragment {

    //private SettingsAdapter listAdapter;

    private RecyclerView settingsList;

    public FragmentSettings() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        init(view);
        return view;
    }

    private void init(final View view) {
        /*settingsList = (RecyclerView) view.findViewById(R.id.settings_list);
        settingsList.setHasFixedSize(true);

        // OnClick logic is in SettingsAdapter.
        listAdapter = new SettingsAdapter((AppCompatActivity) getActivity());
        settingsList.setAdapter(listAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        settingsList.setLayoutManager(new LinearLayoutManager(view.getContext()));

        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(settingsList.getContext(), layoutManager.getOrientation());
        settingsList.addItemDecoration(dividerItemDecoration);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        settingsList.setItemAnimator(itemAnimator);*/
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private OnFragmentInteractionListener mListener;
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

