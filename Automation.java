package org.inter;

/*Interface :Language
Methods   :Java()
Interface :TestTool
Methods   :Selenium()
Execution class: Automation 
Implement all the methods of interface and  in Automation class
try to apply This,Super,Final keywords in your code ..............*/

public class Automation extends ReportingTool implements Language, TestTool {

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.tool();
	}

	@Override
	public void java() {
		System.out.println("JAVA");
	}

	@Override
	public void selenium() {
		System.out.println("Selenium");
	}

	public void reportingTool() {
		System.out.println("testNg");
	}

	public void tool() {
		this.reportingTool();
		super.reportingTool();
	}
}
