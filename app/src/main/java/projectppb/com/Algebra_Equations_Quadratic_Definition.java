package projectppb.com;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Algebra_Equations_Quadratic_Definition extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra__equations__quadratic__definition);
        pdfView= (PDFView) findViewById(R.id.pdfViewAlgebra_Equations_Quadratic_Definition);
        pdfView.fromAsset("Algebra_Equations_Quadratic_Definition.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();
    }
}
