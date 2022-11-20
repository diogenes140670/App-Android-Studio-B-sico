package diogenes.pereira.apppizzacritica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "App_Basico";

    int tempoDeEspera = 1000 * 10;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "OnCreate: Tela Splash carregada...");

        trocarTela();
    }


    private void trocarTela() {

        Log.d(TAG, "TrocarTela: tela vai  mudar...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "TrocarTela: tela mudando...");

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();


            }


        }, tempoDeEspera);

    }
}

