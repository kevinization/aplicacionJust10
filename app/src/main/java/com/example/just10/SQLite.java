package com.example.just10;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {
    public SQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Database) {
        /*ejemplo de creacion de tabla en base de datos*/
        Database.execSQL("create table ejemplotabla(nombreTema text primary key, primerCampo int, segundoCampo text)");
    }
    /*
    private Temas campo1, campo2 , campo3;
    @Override
    private void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstancestate);
        setcontentView(R.layout.activity_algo):

        campo1 = (EditText)findViewById(r.id.txt_algo1);
        campo2 = (EditText)findViewById(r.id.txt_algo2);
        campo3 = (EditText)findViewById(r.id.txt_algo3);
    }
    */
    //Metodos sql
    /*
    public void Register(Vew view){
        SQLite admin = new AdminSQLiteOpenHelper(this, name: "just10", null, 1);
        SQLiteDatabase dataBase = admin.getWritetableDatabase();

        //guardar cosas en la base de datos dependiendo de lo que se inserte en campos
        String algo1 = campo1.getText().toString();
        String algo2 = campo2.getText().toString();
        String algo3 = campo3.getText().toString();

        //validar campos
        if(!algo1.isEmpty() && !algo2.isEmpty() && !algo3.isEmpty()){
            ContentValues register = new ContentValues();

            register.put("algo1", algo1);
            register.put("algo2", algo2);
            register.put("algo3", algo3);

            Database.insert("ejemplotabla", null, register);

            Databade.close();
        }else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
    //metodo para consultar o buscar un producto
    public void Search(Vew view){

    }
    */

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
