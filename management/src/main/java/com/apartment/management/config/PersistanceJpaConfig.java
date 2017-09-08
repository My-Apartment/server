package com.apartment.management.config;

import java.io.IOException;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.support.ClasspathScanningPersistenceUnitPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.apartment.management.dao")
@EnableTransactionManagement
public class PersistanceJpaConfig {
	
	////////////////////////////
	// Public Methods
	///////////////////////////
	
	
	/**
	 * This method configures spring's transaction infrastructure for an application
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public PlatformTransactionManager transactionManager() throws IOException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory());
		return transactionManager;
	}
	
	/**
	 * This Method creates a JPA EntityManager factory bean in spring application context
	 * @return
	 * @throws IOException 
	 */
	@Bean(name="entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() throws IOException {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		ClasspathScanningPersistenceUnitPostProcessor aClasspathScanProcessor = new ClasspathScanningPersistenceUnitPostProcessor("com.apartment.management");
		LocalContainerEntityManagerFactoryBean aEntityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		aEntityManagerFactory.setJpaVendorAdapter(adapter);
		aEntityManagerFactory.setDataSource(getDataSource());
		aEntityManagerFactory.setPackagesToScan(new String[] {"com.apartment.management"});
		aEntityManagerFactory.setJpaProperties(getJpaProperties());
		aEntityManagerFactory.setPersistenceUnitPostProcessors(aClasspathScanProcessor);
		aEntityManagerFactory.afterPropertiesSet();
		return aEntityManagerFactory.getObject();
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	/**
	 * This method to configure BasicdataSource Bean for the application context 
	 * @return
	 */
	@Bean
	public DataSource getDataSource() {
		BasicDataSource aDataSource = new BasicDataSource();
		aDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		aDataSource.setUrl("jdbc:mysql://localhost:3306/ApartmentDB");
		aDataSource.setUsername("root");
		aDataSource.setPassword("password");
		aDataSource.setMaxActive(50);
		aDataSource.setMinIdle(2);
		aDataSource.setMaxIdle(20);
		return aDataSource;
	}
	
	public Properties getJpaProperties() throws IOException {
		Resource aResource = new ClassPathResource("jpa.properties");
		Properties aProperties = PropertiesLoaderUtils.loadProperties(aResource);
		return aProperties;
	}
	
}
