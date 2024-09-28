package org.ldxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
private Integer gid;
private String gname;
private float gprice;
private String gpic;

    public Goods(String gname, float gprice, String gpic) {
        this.gname = gname;
        this.gprice = gprice;
        this.gpic = gpic;
    }
}
