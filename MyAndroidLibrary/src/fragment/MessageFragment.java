/**
 * 
 */
package fragment;

import com.example.myandroidlibrary.R;


import android.annotation.SuppressLint;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author CSH 2015-7-24
 */
@SuppressLint("NewApi")
public class MessageFragment extends Fragment {

	/**
	 * 
	 */
	public MessageFragment() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.message_layout, container, false);
	}
}
