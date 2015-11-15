package br.com.computacaomovel.ra20635316.rosivanrodrigues.atividade4projetofinal.banco;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by rosivanrs on 15/10/15.
 */
public class BancoUtil extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "livros";
    public static final String ID = "_id";
    public static final String TITULO = "titulo";
    public static final String AUTOR = "autor";
    public static final String EDITORA = "editora";
    public static final int VERSAO = 1;


    public BancoUtil(Context context) {

        //super(context, name, factory, version, errorHandler);

        super(context, NOME_BANCO,null,VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + TITULO + "text,"
                + AUTOR + "text,"
                + EDITORA + "text"
                +")";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS" + TABELA);

        this.onCreate(db);
    }

}
