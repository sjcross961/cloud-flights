package com.aws.lambda;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

/**
 * Class to handle access to AWS DynamoDB
 *
 * @author Sam Cross u188166
 */
public final class FlightHandler {

    private FlightHandler() {
    }

    public static Table getTable(String tableName) {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
        client.setRegion(Region.getRegion(Regions.EU_WEST_1));
        DynamoDB dynamoDB = new DynamoDB(client);
        return dynamoDB.getTable(tableName);
    }
}
