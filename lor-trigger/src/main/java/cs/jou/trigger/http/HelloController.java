package cs.jou.trigger.http;

import cs.jou.trigger.http.api.HelloApi;
import cs.jou.trigger.http.limit.Limit;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class HelloController implements HelloApi {

    @Limit
    @Override
    public String getHello(HttpServletResponse response) throws IOException {
        return "hello str";
    }
}
