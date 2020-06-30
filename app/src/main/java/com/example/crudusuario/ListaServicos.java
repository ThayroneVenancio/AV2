package com.example.crudusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaServicos extends Activity {


    private AlertDialog.Builder dialog;
    ListView listaServ;
    private String[] listaServiços = {"Mercantil Alexandre", "Mercantil Leandro", "Farmácia Pague Menos",
            "Atacadão Lag", "Lotéricas", "Farmácia Conviva","Caixa Econômica Federal","Banco do Brasil","Bradesco",
            "Farmácia Feitosa","Hospital São Vicente","Hospital São Camilo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_servicos);

        listaServ=findViewById(R.id.listaServ);

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,android.R.id.text1, listaServiços

        );


        listaServ.setAdapter(adaptador);

        listaServ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem = "";
                        mensagem += "\n Horário de Funcionamento : 8h-20h";
                        mensagem += "\n Portões Fechados";
                        mensagem += "\n Telefone :(88) 3581-6985";

                        dialog.setTitle("Supermercado Alexandre");
                        dialog.setMessage(mensagem);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;


                    case 1:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem2 = "";
                        mensagem2 += "\n Horário de Funcionamento : 8h-20h";
                        mensagem2 += "\n Portões Fechados";
                        mensagem2 += "\n Telefone :(88) 3581-7777";

                        dialog.setTitle("Supermercado Leandro");
                        dialog.setMessage(mensagem2);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 2:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem3 = "";
                        mensagem3 += "\n Horário de Funcionamento : 7h-22h";
                        mensagem3 += "\n Portões Abertos";
                        mensagem3 += "\n Telefone :(88) 3581-9105";

                        dialog.setTitle("Farmácia Pague Menos");
                        dialog.setMessage(mensagem3);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 3:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem4 = "";
                        mensagem4 += "\n Horário de Funcionamento : 7h-22h";
                        mensagem4 += "\n Portões Fechados";
                        mensagem4 += "\n Telefone : (88) 3581-2200";

                        dialog.setTitle("Atacadão Lag");
                        dialog.setMessage(mensagem4);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 4:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem5 = "";
                        mensagem5 += "\n Horário de Funcionamento : 7h-14h";
                        mensagem5 += "\n Portões Fechados";
                        mensagem5 += "\n Telefone :(88) 3581-6800";

                        dialog.setTitle("Lotéricas");
                        dialog.setMessage(mensagem5);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 5:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem6 = "";
                        mensagem6 += "\n Horário de Funcionamento : 8h-22h";
                        mensagem6 += "\n Portões Abertos";
                        mensagem6 += "\n Telefone :(88) 99638-9678";

                        dialog.setTitle("Farmácia Conviva");
                        dialog.setMessage(mensagem6);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 6:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem7 = "";
                        mensagem7 += "\n Horário de Funcionamento : 8h-12h";
                        mensagem7 += "\n Portôes Abertos";
                        mensagem7 += "\n Telefone :(88) 3582-7200";

                        dialog.setTitle("Caixa Econômica Federal");
                        dialog.setMessage(mensagem7);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 7:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem9 = "";
                        mensagem9 += "\n Horário de Funcionamento : 7h-10h";
                        mensagem9 += "\n Portôes Abertos";
                        mensagem9 += "\n Telefone : 0800 729 0722";

                        dialog.setTitle("Banco do Brasil");
                        dialog.setMessage(mensagem9);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 8:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem10 = "";
                        mensagem10 += "\n Horário de Funcionamento : 7h-10h";
                        mensagem10 += "\n Portôes Abertos";
                        mensagem10 += "\n Telefone :(88) 3581-6800";

                        dialog.setTitle("Bradesco");
                        dialog.setMessage(mensagem10);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 9:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem11 = "";
                        mensagem11 += "\n Horário de Funcionamento : 7h-22h";
                        mensagem11 += "\n Portôes Abertos";
                        mensagem11 += "\n Telefone :(88) 3581-1253";

                        dialog.setTitle("Farmácia Feitosa");
                        dialog.setMessage(mensagem11);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 10:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem12 = "";
                        mensagem12 += "\n Horário de Funcionamento : Aberto 24h";
                        mensagem12 += "\n Telefone :(88) 3581-3134";

                        dialog.setTitle("Hospital São Vicente");
                        dialog.setMessage(mensagem12);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;

                    case 11:
                        dialog = new AlertDialog.Builder(ListaServicos.this);
                        String mensagem13 = "";
                        mensagem13 += "\n Horário de Funcionamento : Abertos 24h";
                        mensagem13 += "\n Telefone :(88) 3582-7800";

                        dialog.setTitle("Hospital São Camilo");
                        dialog.setMessage(mensagem13);

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setCancelable(false);

                        dialog.create();
                        dialog.show();

                        break;


                }

            }
        });
    }
}
