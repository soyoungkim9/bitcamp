package step19.ex5;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContext {
    private ArrayList<Class> list = new ArrayList<>();
    
    public ApplicationContext(String packageName) throws Exception {
        String path = packageName.replace(".", "/");
        
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        
        URL url = classLoader.getResource(path);
        
        File dir = new File(url.getPath());
        
        if (!dir.isDirectory())
            return;
        findFiles(dir, packageName);
    }
    
    private void findFiles(File dir, String packageName) throws Exception {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() ||)
            }
        });
    }
    
   public List<Class> getFiles() {
       return this.list;
   }
}
