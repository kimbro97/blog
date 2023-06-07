package blog.backend.html;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class HtmlController implements ErrorController {

    @GetMapping("/error")
    public String redirectRoot(HttpServletRequest request) {
        log.info("index");
        System.out.println(request.getRequestURI());
        return "index.html";
    }

    @GetMapping("/console/**")
    public String redirectRConsole() {
        log.info("console");
        return "console.html";
    }

    public String getErrorPath() {
        return null;
    }
}
