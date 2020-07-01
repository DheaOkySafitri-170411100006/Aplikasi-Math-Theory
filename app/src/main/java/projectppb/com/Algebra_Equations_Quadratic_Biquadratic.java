package projectppb.com;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Algebra_Equations_Quadratic_Biquadratic extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra__equations__quadratic__biquadratic);
        pdfView= (PDFView) findViewById(R.id.pdfView_Algebra_Equations_Quadratic_Biquadratic);
        pdfView.fromAsset("Algebra_Equations_Quadratic_Biquadratic.docx.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();
    }
}
