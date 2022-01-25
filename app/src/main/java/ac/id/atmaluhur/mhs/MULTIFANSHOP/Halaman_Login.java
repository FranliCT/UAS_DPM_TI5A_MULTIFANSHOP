package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);
    }

    public void regis(View view) {
        Intent intent = new Intent(Halaman_Login.this, Halaman_Register.class);
        startActivity(intent);
    }

    public void pass(View view) {
        Intent intent = new Intent(Halaman_Login.this, Halaman_LupaPassword1.class);
        startActivity(intent);
    }

    public void dash(View view) {
        Intent intent = new Intent(Halaman_Login.this, Halaman_Dashboard.class);
        startActivity(intent);
    }

    public void cover(View view) {
        Intent intent = new Intent(Halaman_Login.this, cover.class);
        startActivity(intent);
    }
}