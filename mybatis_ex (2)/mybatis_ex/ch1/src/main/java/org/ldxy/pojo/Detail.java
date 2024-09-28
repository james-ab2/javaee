package org.ldxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
   private Integer did;
   private String uaddress;
   private String uphone;
   private String urealname;
   private String umail;
}
