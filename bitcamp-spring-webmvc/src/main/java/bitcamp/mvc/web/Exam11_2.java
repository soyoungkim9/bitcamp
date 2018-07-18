// 파일 업로드 - AJAX
package bitcamp.mvc.web;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController 
@RequestMapping("/exam11_2") 
public class Exam11_2 {
    
    @Autowired ServletContext sc;
    
    @PostMapping("upload01")
    public Object upload01(
            MultipartFile files) {
        
        HashMap<String,Object> jsonData = new HashMap<>();
        String fileDir = sc.getRealPath("/files");
  
        String filename = UUID.randomUUID().toString();
        jsonData.put("filename", filename);
        jsonData.put("filesize", files.getSize());
        jsonData.put("Originname", files.getOriginalFilename());
        try {
            File path = new File(fileDir + "/" + filename);
            System.out.println(path);
            files.transferTo(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonData;
    }
    
    @PostMapping("upload02")
    public Object upload02(
            MultipartFile[] files) {
        
        String fileDir = sc.getRealPath("/files");
        ArrayList<Map<String,Object>> jsonDataList = new ArrayList<>();
        
        for(int i = 0; i < files.length; i++) { 
            HashMap<String,Object> jsonData = new HashMap<>();
            String filename = UUID.randomUUID().toString();
            jsonData.put("filename", filename);
            jsonData.put("filesize", files[i].getSize());
            jsonData.put("Originname", files[i].getOriginalFilename());
            try {
                File path = new File(fileDir + "/" + filename);
                System.out.println(path);
                files[i].transferTo(path);
                jsonDataList.add(jsonData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonDataList;
    }
    
    @PostMapping("upload03")
    public Object upload03(
            String name, int age,
            MultipartFile[] files) {
        
        String fileDir = sc.getRealPath("/files");
        HashMap<String, Object> returnData = new HashMap<>();
        returnData.put("name", name);
        returnData.put("age", age);

        ArrayList<Map<String,Object>> jsonDataList = new ArrayList<>();
        returnData.put("files", jsonDataList);
        
        for(int i = 0; i < files.length; i++) { 
            HashMap<String,Object> jsonData = new HashMap<>();
            String filename = UUID.randomUUID().toString();
            jsonData.put("filename", filename);
            jsonData.put("filesize", files[i].getSize());
            jsonData.put("Originname", files[i].getOriginalFilename());
            try {
                File path = new File(fileDir + "/" + filename);
                System.out.println(path);
                files[i].transferTo(path);
                jsonDataList.add(jsonData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return returnData;
    }
}













