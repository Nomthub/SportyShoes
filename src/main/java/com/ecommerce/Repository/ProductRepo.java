package com.ecommerce.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.Entity.*;

@Repository
public class ProductRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<ProductEntity> getAllProducts(){
		return jdbcTemplate.query("select * from eproduct",new RowMapper<ProductEntity>(){
			
			public ProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				ProductEntity obj= new ProductEntity();
				obj.setId(rs.getLong(1));
				obj.setName(rs.getString(2));
				obj.setPrice(rs.getBigDecimal(3));
				obj.setDateAdded(rs.getTimestamp(4));
				return obj;
			}
		
	});
	}
}
