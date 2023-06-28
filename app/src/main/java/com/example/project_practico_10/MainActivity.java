package com.example.project_practico_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.project_practico_10.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
binding.buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name = binding.editTextName.getText().toString();
        String lastName = binding.editTextLastName.getText().toString();
        String email = binding.editTextEmail.getText().toString();
        String pass = binding.editTextPassword.getText().toString();
        String text = "Usuario: " + name + " " + lastName + " " + "Email: " + email + " " + "Contraseña: " + pass;
        Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();
    }
});
    }
}
