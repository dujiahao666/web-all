package as;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.function.BiConsumer;

@WebServlet("/it3")
public class T4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("用户名："+username);
        String[] parameterValues = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(parameterValues));
        System.out.println("======================");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            String[] parameterValues1 = req.getParameterValues(s);
            if(parameterValues1.length>1){
                System.out.println(Arrays.toString(parameterValues1));
            }else {
                System.out.println(parameterValues1[0]);
            }
        }
        System.out.println("=========================");
        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach(new BiConsumer<String, String[]>() {
            @Override
            public void accept(String s, String[] strings) {
                if (strings.length>1){
                    System.out.println(s+"="+Arrays.toString(strings));
                }
                else {
                    System.out.println(s+"="+strings[0]);
                }
            }
        });

    }
}
