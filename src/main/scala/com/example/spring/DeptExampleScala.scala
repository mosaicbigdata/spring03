package com.example.spring

import org.apache.commons.logging.LogFactory

object DeptExampleScala {
	
	def main(args: Array[String]): Unit = {

		var dept : Dept = new Dept;
		dept.deptno = 10;
		dept.dname = "xxx"
		dept.loc = "yyyy"
	
		println(dept);
		dept.print();
		dept.print2();
		println(dept.deptno + dept.dname);
	}
}