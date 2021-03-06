package com.example.myfirstapp;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class ComposeMessageActivity extends ActionBarActivity {
	
	//protected MenuItem searchItem;
	//protected EditText searchContacts;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_compose_message);

		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayShowTitleEnabled(false);
		//actionBar.setDisplayShowHomeEnabled(false);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	/**
	 * Adds items to action bar by inflating the menu resource into the given Menu.
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.compose_message, menu);
		
		// Associate searchable.xml configuration with the SearchView
		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
		
		MenuItem searchItem = menu.findItem(R.id.action_search);

		SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
		//searchView.setSearchableInfo(searchManager.getSearchableInfo(new ComponentName(getApplicationContext(), SearchableActivity.class)));
		//searchView.setIconifiedByDefault(false);

		return super.onCreateOptionsMenu(menu);
	}
	
	/**
	 * Called when the user clicks on an action in the Action Bar.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
			case R.id.search_people:
				openSearchPeople();
				return true;
			case R.id.action_settings:
				openSettings();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_compose_message,
					container, false);
			return rootView;
		}
	}

	public void openSearchPeople() {
		// Do something
	}

	public void openSettings() {
		// Do something
	}

}
