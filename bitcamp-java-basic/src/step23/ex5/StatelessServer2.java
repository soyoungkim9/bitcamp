// Stateless와 Stateful 의 비교 
package step23.ex5;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

//stateless 방식의 특징
//=> 요청 할 때마다 서버와 연결한다. 응답 받은 후 서버와의 연결을 끊는다. 
//=> 요청자를 구분할 수 없어,
public class StatelessServer2 {
    static int countClient = 0;
    static HashMap<Integer, Integer> sessionMap = new HashMap<>();
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중...");
        
        // 합계를 계산하는 서버를 만들어보자!
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중...");
            processRequest(socket);
        }
    }
    
    static void processRequest(Socket socket) throws Exception {
        try (
            Socket socket2 = socket;
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            ) {
            
            // 클라이언트와 연결되면 클라이언트는 값을 한 개 보낸다. 
            // 서버는 그 클라이언트의 값을 기존 합계에 추가해야 한다.
            
            
            String str = in.nextLine();
            int clientId = Integer.parseInt(in.nextLine());
            if (str.equals("")) {
                // 클라이언트가 다음의 데이터를 보냈을 때
                // => "\n123\n"
                out.println("결과 = " + sessionMap.get(clientId));
                return;
            }
            
            // 클라이언트 아이디가 0일 때,
            // 아직 서버로부터 클라이언트 식별번호를 발급받지 않은 상태이기 때문에
            // 새 번호를 발급한다.
            // 예를 들어 클라이언트가 다음과 같은 데이터를 보냈다면,
            // => "100\n0\n"
            if(clientId == 0) {
                clientId = ++countClient;
                sessionMap.put(clientId, 0); // 새 클라이언트 ID를 발급할 때 0으로 설정한다.
            }
            // 클라이언트가 다음의 데이터를 보냈을 때
            // => "100\n123\n"
            int value = Integer.parseInt(str);
            
            // 클라이언트 아이디로 기존 값ㅇ르 꺼낸다.
            int sum = sessionMap.get(clientId);
            
            // 기존 값에 새 값을 더하여 저장한다.
            sessionMap.put(clientId, sum + value);
            
            // 작업을 수행한 후 항상 클라이언트에게 식별 번호를 보낸다.
            out.printf("%d\n", clientId);
        }
    }
}






