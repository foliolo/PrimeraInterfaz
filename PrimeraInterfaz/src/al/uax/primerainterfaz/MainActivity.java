package al.uax.primerainterfaz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("TAG", "Create");
		setContentView(R.layout.main);
//		setContentView(R.layout.main2);
//		setContentView(R.layout.main3);
		
		Button boton = (Button)findViewById(R.id.boton_enviar);
		boton.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Toast.makeText(getApplicationContext(), "Botón envíar pulsado", Toast.LENGTH_LONG).show();
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.e("TAG", "Start");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e("TAG", "Resume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.e("TAG", "Pause");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e("TAG", "Restart");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.e("TAG", "Stop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e("TAG", "Destroy");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
