
package com.klu.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public Map<String, String> getAccounts() {

        return Map.of(
            "status", "SUCCESS",
            "message", "Account API is working!",
            "service", "PathRewritingAPI"
        );
    }
}
