package in.reqres.data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Resourse {

    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<DataUser> data;
    private Support support;

    public Resourse() {
        super();
    }

    public Resourse(Integer page, Integer per_page, Integer total, Integer total_pages, List<DataUser> data, Support support) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.support = support;
    }
}
