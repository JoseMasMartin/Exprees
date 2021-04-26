package josemas.express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void registrar(View v)
    {
        Intent intent = new Intent(Registro.this,Home.class);
        startActivity(intent);

    }
    public void inicioSesion(View v)
    {
        Intent intent = new Intent(Registro.this,HomeActivity.class);
        startActivity(intent);

    }
}