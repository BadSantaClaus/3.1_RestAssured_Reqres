package in.reqres.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Support {

    private String url;
    private String text;

    public Support(){
        super();
    }

    public Support(String url, String text) {
        this.url = url;
        this.text = text;
    }
}
