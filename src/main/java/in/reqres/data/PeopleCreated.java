package in.reqres.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeopleCreated extends People{

    private String id;
    private String createdAt;

    public PeopleCreated(){
        super();
    }

    public PeopleCreated(String name, String job, String id, String createdAt){
        super(name,job);
        this.id=id;
        this.createdAt=createdAt;
    }
}
