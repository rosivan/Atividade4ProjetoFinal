package br.com.computacaomovel.ra20635316.rosivanrodrigues.atividade4projetofinal.banco;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rosivanrs on 15/10/15.
 */
public class BancoController {

    private SQLiteDatabase db;
    private BancoUtil banco;

    public BancoController(Context context){
        banco = new BancoUtil(context);
    }

    public String insereDado(String titulo, String autor, String editora) {

        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(BancoUtil.TITULO, titulo);
        valores.put(BancoUtil.AUTOR, autor);
        valores.put(BancoUtil.EDITORA, editora);
        resultado = db.insert(BancoUtil.TABELA, null, valores);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro";
        } else {
            return "Registro Inserido com sucesso";
        }

    }

}
