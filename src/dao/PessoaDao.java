/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author 631510300
 */
public class PessoaDao {

    public void cadastarPessoaDAO(Pessoa pVO) {
        try {
            //buscar conexão com BD
            Connection con = Conexao.getConexao();
            String sql = "insert into pessoas values (null,?,?,?,)";
            //Criar espaço para executar script
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCpf());
            pst.setString(3, pVO.getEndereco());
            pst.setString(4, pVO.getTelefone());
            pst.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastar Pessoa\n" + e.getMessage());
        }
    }
    
    public ArrayList<Pessoa>getPessoas(){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try {
            
        } catch (SQLException e) {
            System.out.println("Erro ao listr pessoas.\n"+e.getMessage());
        }
        return pessoas;
    }
}
