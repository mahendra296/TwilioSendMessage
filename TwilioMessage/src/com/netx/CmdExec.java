package com.netx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class CmdExec {
	public static void main(String args[]) {
		CmdExec cmdExec = new CmdExec();
		String[] options = new String[] { "java", "-jar", "D:\\htmlToPDF.jar", "d:\\2830_9396.html", "d:\\", "a2" };
		cmdExec.letsRun(options);
	}
	public void letsRun(String[] options) {
		long mili = System.currentTimeMillis();
		try {
			System.out.print("Execute ");
			for (int i = 0; i < options.length; i++) {
				System.out.print(options[i] + " ");
			}
			System.out.println("");
			//////////////////////////
			Process p = Runtime.getRuntime().exec(options);
			System.err.println("Error Out put of sop of jar run");
			try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
				String line;
				while ((line = input.readLine()) != null) {
					System.out.println(line);
				}
			}
			System.out.println("Out put of sop of jar run");
			try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
				String line;
				while ((line = input.readLine()) != null) {
					System.out.println(line);
				}
			}
			p.waitFor();
			System.out.println("Process Execute status =" + (p.exitValue() == 0 ? "Success" : "Fail"));
		} catch (Exception err) {
			err.printStackTrace();
		} finally {
			System.out.println("Total PDF Time: " + (System.currentTimeMillis() - mili));
		}

	}
}