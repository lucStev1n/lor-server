package cs.jou.trigger.http.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Validated
@Tag(name = "1tn", description = "2td")
@RequestMapping("/api/v1")
public interface HelloApi {

    @GetMapping("/hello")
    @Operation(summary = "1s", description = "2d")
    String getHello(HttpServletResponse response) throws IOException;
}
