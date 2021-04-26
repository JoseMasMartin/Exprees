package josemas.express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn_inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_inicio= findViewById(R.id.inicio);



    }

    public void onClickButton(View v)
    {
        Intent intent = new Intent(HomeActivity.this,Home.class);
        startActivity(intent);

    }
    public void registro(View v)
    {
        Intent intent = new Intent(HomeActivity.this,Registro.class);
        startActivity(intent);

    }
}