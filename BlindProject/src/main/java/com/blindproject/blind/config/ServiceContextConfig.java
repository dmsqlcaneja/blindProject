package com.blindproject.blind.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages= {"com.blindproject.blind.dao.mybatis", "com.blindproject.blind.service"})
public class ServiceContextConfig {
	 
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		
		/* Mysql or mariaDB*/
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://211.238.142.33:3306/blinddb?serverTimezone=UTC");
		dataSource.setUsername("blind");
		dataSource.setPassword("0000");
		
		
		/* PULL 관리*/
		dataSource.setRemoveAbandoned(true);
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(30);
		
		//dataSource.setRemove
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(BasicDataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver()
					.getResources("classpath:com/blindproject/blind/dao/mybatis/mapper/*.xml"));
		
		return sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		//sqlSessionFactoryBean은 맞지만 팩토리 객체를 반환하기 때문에.
		//SqlSessionFactoryBean->SqlSessionFactory로 변경하고 SqlSessionFactory return은 .getObject를 해야함
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
