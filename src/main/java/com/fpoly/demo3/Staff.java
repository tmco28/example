package com.fpoly.demo3;

import org.springframework.stereotype.Controller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Staff {
 String id;
 String fullName;
 String email;
 Double salary;
 String position;
 
}
