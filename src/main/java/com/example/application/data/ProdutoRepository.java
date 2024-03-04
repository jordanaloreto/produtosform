package com.example.application.data;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class ProdutoRepository {
    public boolean salvar(Produto produtos) {
		try {
			Connection connection = DBConnection.getInstance().getConnection();
			
			String insert = "INSERT INTO produtos (nome, fornecedor, ultimaDataCompra, preco)"
					+ "values"
					+ "(?, ?, ?, ?)";
			PreparedStatement prepearedStatment1 = connection.prepareStatement(insert);
			prepearedStatment1.setString(1, produtos.getNome());
			prepearedStatment1.setString(2, produtos.getFornecedor());
			prepearedStatment1.setString(3, produtos.getUltimaDataCompra());
			prepearedStatment1.setString(4, produtos.getPreco());
			// prepearedStatment1.setDate(3, java.sql.Date.valueOf(produtos.getUltimaDataCompra()));
            // prepearedStatment1.setDouble(4, (produtos.getPreco()));
			int resultado = prepearedStatment1.executeUpdate();
			if(resultado > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
            return false;
		}

	}
}
