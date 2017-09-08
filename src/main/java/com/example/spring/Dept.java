package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Dept {
	int deptno;
	String dname;
	String loc;
	
	public Dept() {
		System.out.println("###");
		System.out.println("### Dept()...");
		System.out.println("###");
	}
	
//	public Dept(int deptno, String dname, String loc) {
//		this.deptno = deptno;
//		this.dname = dname;
//		this.loc = loc;
//	}
	
	public void print() {
		System.out.println("###1 " + toString());
		throw new RuntimeException("my exception...");
	}
	
	public void print2() {
		System.out.println("###2 " + toString());
	}
}
