// 파일 정보 조회 - java.io.File 클래스
package step16.ex1;

import java.io.File;

public class Exam02 {
    public static void main(String[] args) throws Exception {
        // File 클래스
        // => 파일이나 디렉토리 정보를 관리
        // => 파일이나 디렉토리를 생성, 삭제, 변경
        
        // 1) 현재 파일 정보 조회
        // "." - 현재 폴더
        // ".." - 상위 폴더
        File currentDir = new File("src/step16/Exam01.java");
        System.out.printf("파일명: %s\n", currentDir.getName());
        System.out.printf("파일크기: %s\n", currentDir.length());
        System.out.printf("경로: %s\n", currentDir.getPath());
        System.out.printf("절대경로: %s\n", currentDir.getAbsolutePath());
        System.out.printf("계산된 절대경로: %s\n", currentDir.getCanonicalPath());
        // 존재하지 않은 폴더의 경우 디렉토리 여부를 알아 낼수 없다.
        System.out.printf("총 크기: %d\n", currentDir.getTotalSpace());
        System.out.printf("가용 크기: %d\n", currentDir.getUsableSpace()); 
        System.out.printf("여유 크기: %d\n", currentDir.getFreeSpace());
        // 존재하지 않는 폴더의 경우 디렉토리 여부를 알아 낼 수 없다.
        System.out.printf("디렉토리여부: %b\n", currentDir.isDirectory());
        System.out.printf("디렉토리여부: %b\n", currentDir.isFile());
        System.out.printf("감춤폴더: %b\n", currentDir.isHidden());
        System.out.printf("감춤폴더: %b\n", currentDir.exists());
        System.out.printf("실행가능여부: %b\n", currentDir.canExecute());
        
        System.out.println("--------------------");
        
        // 2) 존재하지 않는 파일 정보 조회
        File parentDir = new File("src/step16.ok.java");
        System.out.printf("파일명: %s\n", parentDir.getName());
        System.out.printf("파일크기: %s\n", parentDir.length());
        System.out.printf("경로: %s\n", parentDir.getPath());
        System.out.printf("절대경로: %s\n", parentDir.getAbsolutePath());
        System.out.printf("계산된 절대경로: %s\n", parentDir.getCanonicalPath());
        System.out.printf("총 크기: %d\n", parentDir.getTotalSpace());
        System.out.printf("가용 크기: %d\n", parentDir.getUsableSpace());
        System.out.printf("여유 크기: %d\n", parentDir.getFreeSpace());
        System.out.printf("디렉토리여부: %b\n", parentDir.isDirectory());
        System.out.printf("디렉토리여부: %b\n", parentDir.isFile());
        System.out.printf("감춤폴더: %b\n", parentDir.isHidden());
        System.out.printf("감춤폴더: %b\n", parentDir.exists());
        System.out.printf("실행가능여부: %b\n", parentDir.canExecute());
    }
}
