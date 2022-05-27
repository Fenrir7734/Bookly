package com.fenrir.masterdetail;

import com.fenrir.masterdetail.dto.SignUpDTO;
import com.fenrir.masterdetail.model.Role;
import com.fenrir.masterdetail.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <a href="http://localhost:8080/swagger-ui.html">Swagger url</a>
 */

@SpringBootApplication
public class MasterDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterDetailApplication.class, args);
    }
}
