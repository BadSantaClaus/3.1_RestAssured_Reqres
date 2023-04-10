package in.reqres.data;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class People {

    private String name;
    private String job;

    public People() {
        super();
    }

    public People(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
