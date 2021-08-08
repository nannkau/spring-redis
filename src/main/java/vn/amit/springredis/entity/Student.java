package vn.amit.springredis.entity;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RedisHash("Student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String fullName;
    private String studentCode;
}
