package com.codingstuff.nestedexapandabler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Ping por segundos");
        nestedList1.add("Limpar registros automaticamente");

        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Encaminhar DNS");
        nestedList2.add("DNS primário");
        nestedList2.add("DNS secundário");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Encaminhar UDP");
        nestedList3.add("UDP Gateway (Remoto)");

        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("Número máximo de threads");
        nestedList4.add("Tethering subnet (beta)");
        nestedList4.add("Desativar demora TCP");
        nestedList4.add("Ativar wakelock");

        mList.add(new DataModel(nestedList1 , "Registros e ping"));
        mList.add(new DataModel( nestedList2,"Encaminhamento de DNS"));
        mList.add(new DataModel( nestedList3,"Encaminhamento de UDP"));
        mList.add(new DataModel(nestedList4 ,"Configurações Avançadas"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}