package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.fastcampus.ch2") // 지정된 패키지에서 발생한 예외만 처리
//@ControllerAdvice		// 모든 패키지에 적용 
public class GlobalCatcher {

	@ExceptionHandler(Exception.class)
	public String chatcher(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}

	@ExceptionHandler({ NullPointerException.class, FileNotFoundException.class })
	public String chatcher2(Exception ex, Model m) {
		m.addAttribute("ex", ex);
		return "error";
	}

}
