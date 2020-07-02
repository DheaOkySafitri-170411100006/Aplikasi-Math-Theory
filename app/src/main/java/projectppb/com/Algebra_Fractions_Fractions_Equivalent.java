package projectppb.com;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Algebra_Fractions_Fractions_Equivalent extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra__fractions__fractions__equivalent2);
        pdfView= (PDFView) findViewById(R.id.Algebra_Fractions_Fractions_Equivalent);
        pdfView.fromAsset("Algebra_Fractions_Fractions_Equivalent.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();
    }
}
