package blog.backend.html;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HtmlController implements ErrorController {

    @GetMapping("/error")
    public String redirectRoot() {
        log.info("index");
        return "index.html";
    }

    public String getErrorPath() {
        return null;
    }
}
