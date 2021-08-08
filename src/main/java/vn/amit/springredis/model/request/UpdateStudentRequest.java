package vn.amit.springredis.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentRequest {
    private String id;
    private String fullName;
    private String studentCode;
}
