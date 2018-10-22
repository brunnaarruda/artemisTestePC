package br.ufrpe.artemis.usuario.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import br.ufrpe.artemis.R;

public class EsqueciMinhaSenhaActivity extends AppCompatActivity {
    private EditText cpf;
    private EditText email;
    private EditText novaSenha;
    private EditText confirmarNovaSenha;
    private Button botaoAlterarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_minha_senha);
        cpf = findViewById(R.id.cpfId);
        email = findViewById(R.id.emailId);
        novaSenha = findViewById(R.id.novaSenhaId);
        confirmarNovaSenha = findViewById(R.id.confirmarNovaSenhaId);
    }
}
