package j0524;

import java.io.*;
//입출력(RandomAccessFile) + Thread
//특정 위치에 접근해서 정해진 파일을 생성해주는 클래스

public class ShareTest implements Runnable{
	
	RandomAccessFile raf = null;
	//Thread 두개 생성 => 
	public ShareTest() {
		try {
			//1.경로 포함해서 생성할 파일명 2.모드(r,w,rw)
			//rw -> 없으면 생성,동일한 파일존재-> 덮어쓰기가 가능
			raf = new RandomAccessFile("c:/webtest/3.java/result.txt", "rw");
			//2.쓰레드 객체 생성 ()
			Thread t1 = new Thread(this,"lys"); 
			Thread t2 = new Thread(this,"test");
			//3.Thread 가동
			t1.start();
			t2.start();
		}catch(IOException e) {
			System.out.println("파일 생성에 오류발생 => "  + e);
		}
	}
	
	public static void main(String[] args) {
		//1.Runnable 객체 생성
		//ShareTest st = new ShareTest();
		//데이터 값 저장 or 메서드 호출 
		new ShareTest(); //익명객체 -> 객체 이름만 모를뿐 
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 1000 ; i++) {
				raf.writeBytes(Thread.currentThread().getName() + "[" + i + "]" + raf.getFilePointer()+"\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일 생성에 오류발생 => "  + e);
		}
	}
	
}
