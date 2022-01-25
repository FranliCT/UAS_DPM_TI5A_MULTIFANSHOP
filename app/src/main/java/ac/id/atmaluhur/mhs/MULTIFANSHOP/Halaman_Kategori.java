package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman_Kategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kategori);
    }

    public void back4(View view) {
        Intent intent = new Intent(Halaman_Kategori.this, Halaman_Dashboard.class);
        startActivity(intent);
    }
}