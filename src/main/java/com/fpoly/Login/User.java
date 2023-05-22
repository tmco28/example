package com.fpoly.Login;

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
public class User {
 String username;
 String password;
}
