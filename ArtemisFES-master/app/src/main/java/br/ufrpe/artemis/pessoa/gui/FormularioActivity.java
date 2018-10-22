package br.ufrpe.artemis.pessoa.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import br.ufrpe.artemis.R;

public class FormularioActivity extends AppCompatActivity {
    private ImageView imagemPrestadora;
    private TextView nomePrestadora;
    private TextView servicoPrestado;
    private RatingBar precoRating;
    private RatingBar qualidadeRating;
    private RatingBar atendimentoRating;
    private EditText comentarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    protected void setTela(){

    }
}
