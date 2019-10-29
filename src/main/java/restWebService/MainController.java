package restWebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author  2018/7/26 15:57
 **/
@RestController
public class MainController {
    private static final String format = "hello, %s";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("greet")
    private ResponseBean greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new ResponseBean(counter.incrementAndGet(),
                String.format(format, name));
    }

}
