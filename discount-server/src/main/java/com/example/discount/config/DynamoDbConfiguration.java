package com.example.discount.config;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

/**
 * The Class DynamoDbConfiguration.
 */
@Configuration
@EnableDynamoDBRepositories(basePackages = "com.example.discount")
public class DynamoDbConfiguration {

	/**
	 * Amazon dynamo DB.
	 *
	 * @return the amazon dynamo DB
	 */
	@Bean
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB dynamoDB = new AmazonDynamoDBClient(
				new BasicAWSCredentials("AKIAZ6FBXPUFSRU7YA7G", "voKOAS3GqZoqjxR4pPzpzcJbDVsFsIKWVFX7nORN"));

		if (!StringUtils.isEmpty("dynamodb.us-east-2.amazonaws.com")) {
			dynamoDB.setEndpoint("dynamodb.us-east-2.amazonaws.com");
		}

		return dynamoDB;
	}
}
