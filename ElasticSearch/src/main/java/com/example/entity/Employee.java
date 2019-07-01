package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author Mr.LB
 * @description: TODO
 * @date 2019/7/1 11:15
 */
@Getter
@Setter
@Document(indexName = "employee_index",type = "employee", shards = 1,replicas = 0, refreshInterval = "-1")
public class Employee {

    @Id
    private Integer employeeId;

    @Field
    private String employeeName;

    private Integer age;

    private Date createTime;

    private Date updateTime;
}