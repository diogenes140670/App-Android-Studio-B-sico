package diogenes.pereira.apppizzacritica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import diogenes.pereira.apppizzacritica.R;

public class MainActivity extends AppCompatActivity {

    String TAG = "App_Basico";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Main Carregada...");
    }
}