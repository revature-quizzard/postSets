package com.revature.post_sets;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;


@Data
@DynamoDBTable(tableName = "Tags")
public class Tag {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private String tag_name;

    @DynamoDBAttribute
    private String tag_color;


    public Tag(String name){
        this.tag_name = name;
    }


}
