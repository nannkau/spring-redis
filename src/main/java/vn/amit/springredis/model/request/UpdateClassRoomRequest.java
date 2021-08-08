package vn.amit.springredis.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateClassRoomRequest {
    private Integer id;
    private String name;
}
