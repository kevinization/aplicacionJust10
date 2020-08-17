package com.example.just10;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ClaseBD extends SQLiteOpenHelper {
    private static final String NOMBRE_BD = "developeru.bd";
    private static  final int VERSION_BD=1;
    private static final String TABLA_USUARIOS="CREATE TABLE USUARIOS( IDUSUARIOS INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT, EDAD TEXT, NEDUCATIVO TEXT, NUM TEXT, SYR TEXT, MYD TEXT, UBE TEXT, FCG TEXT, MYM TEXT, EST TEXT)";

    public ClaseBD(@Nullable Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_USUARIOS);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_USUARIOS);
        sqLiteDatabase.execSQL(TABLA_USUARIOS);
    }
    public void agregarCursos(String nombre, String edad, String neducativo){
        SQLiteDatabase bd= getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO USUARIOS (NOMBRE, EDAD, NEDUCATIVO) VALUES('"+nombre+"','"+edad+"','"+neducativo+"')");
            bd.close();
        }
    }
    public String regresaIDUSUARIO()
    {
        SQLiteDatabase bd= getWritableDatabase();
        Cursor cursor=bd.rawQuery("SELECT MAX(IDUSUARIOS) FROM USUARIOS",null);
        String id ="";
        if(cursor.moveToFirst()){
            do {
                id=cursor.getString(0);
            }while (cursor.moveToNext());
        }
        return  id;
    }
    public void actualizarPuntajes(String idusuario, String materia, String puntaje)
    {
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("UPDATE USUARIOS SET '"+materia+"'='"+puntaje+"' WHERE IDUSUARIOS='"+idusuario+"'");
            bd.close();
        }
    }
    public void eliminaRegistros (){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("DELETE FROM USUARIOS");
            bd.close();
        }
    }
    public List mostrarCalificaciones(){
        SQLiteDatabase bd=getWritableDatabase();
        Cursor cursor= bd.rawQuery("SELECT NOMBRE, NUM, SYR, MYD, UBE, FCG, MYM, EST FROM USUARIOS",null);
        ArrayList<String> calificaciones= new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                calificaciones.add(cursor.getString(0) + ",NUM:"+cursor.getString(1)+ ",SYR:"+cursor.getString(2)+ ",MYD:"+cursor.getString(3)+ ",UBE:"+cursor.getString(4)+ ",FCG:"+cursor.getString(5) + ",MYM:"+cursor.getString(6)+ ",EST:"+cursor.getString(7));
                //calificaciones.add(cursor.getString(0));
            }while (cursor.moveToNext());
        }
        return calificaciones;
    }
}
