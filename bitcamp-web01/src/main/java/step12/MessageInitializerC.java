package step12;

import java.util.Map;

import bitcamp.mylib.MessageInitializer;

public class MessageInitializerC implements MessageInitializer {
    
    @Override
    public void onStartup(Map<String, String> msgMap) {
        System.out.println("MessageInitializerB.onStartup()");
        msgMap.put("ok", "확인");
        msgMap.put("no", "취소");
    }
}
