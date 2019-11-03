package restWebService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by bryant on 2019/11/3.
 */
@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String chat() {
        return "chat.html";
    }


    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav = new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }

    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push")
    public String pushToWeb(String message) {
        try {
            WebSocketServer.sendInfo(message, null);
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }


}
