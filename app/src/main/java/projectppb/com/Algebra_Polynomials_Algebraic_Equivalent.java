package projectppb.com;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Algebra_Polynomials_Algebraic_Equivalent extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra__polynomials__algebraic__equivalent);
        pdfView= (PDFView) findViewById(R.id.Algebra_Polynomials_Algebraic_Equivalent);
        pdfView.fromAsset("Algebra_Polynomials_Algebraic_Equivalent.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();

    }
}
