package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman_Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dashboard);
    }

    public void profil(View view) {
        Intent intent = new Intent(Halaman_Dashboard.this, profile.class);
        startActivity(intent);
    }

    public void kate(View view) {
        Intent intent = new Intent(Halaman_Dashboard.this, Halaman_Kategori.class);
        startActivity(intent);
    }

    public void barang(View view) {
        Intent intent = new Intent(Halaman_Dashboard.this, barang.class);
        startActivity(intent);
    }
}