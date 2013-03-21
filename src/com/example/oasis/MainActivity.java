package com.example.oasis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * @date 22/03/2012
 * @author Jonathan Maldonado Contreras
 * @version 0.1
 * @class MainActivity
 * Activitie principal de la aplicación, en ella se inicia el ciclo de ejecución
 * todavía a determinar si desde aquí se escogerá el escenario o no.
 */

public class MainActivity extends Activity {

	/**
	 * @param Bundle savedInstanceState
	 * @return void
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
