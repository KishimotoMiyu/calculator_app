package controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 @WebServlet("/calculator")
 public class CalculatorServlet extends HttpServlet {
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("previousOperand", ""); // 過去操作
		request.setAttribute("currentOperand", ""); // 現在の操作

 		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/calculator.jsp");
 		dispatcher.forward(request, response);
 	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String previousOperand = ""; // 過去操作
		String currentOperand = "0"; // 現在の操作

		if(request.getParameter("previousOperand") != null ){
			previousOperand = (String)request.getParameter("previousOperand");
		}

		List<Integer> listInt = new ArrayList<Integer>();
		List<String> listString = new ArrayList<String>();
		String num[] = {"1", "2", "3","4","5","6","7","8","9","0"};
		String fourArithmeticOperations[] = {"+", "-", "×","÷","="};

		int calculationResult = 0;
		int number = 0;
		String currentString = "";

		for( int i = 0  ; i < previousOperand.length() ; i ++){
			char temp = previousOperand.charAt(i);
			String currentValue  = String.valueOf(temp);

			if(Arrays.asList(num).contains(currentValue)) {
				currentString += currentValue;
			}

			if(Arrays.asList(fourArithmeticOperations).contains(currentValue)) {
				int numberTemp = Integer.parseInt(currentString);
				listInt.add(numberTemp);
				currentString = "";
				if(currentValue != "="){
					listString.add(currentValue);
				}
			}
		}

		// 計算
		for( int i = 0  ; i < listInt.size()  ; i ++){

			int num1 =  (listInt.get(i));

			String op =  "";

			if( i != 0){
				op = String.valueOf(listString.get(i-1));
			}
				
			if(op.equals("")){
				calculationResult = num1;
			}

			if(op.equals("+")){
				calculationResult = num1 + calculationResult;
			}

			if(op.equals("−")){
				calculationResult = calculationResult - num1;
			}

			if(op.equals("×")){
				calculationResult = calculationResult * num1;
			}

			if(op.equals("÷")){
				calculationResult = calculationResult / num1;
			}

		}

		previousOperand = previousOperand.substring(0, previousOperand.length() - 1);
		currentOperand = String.valueOf(calculationResult);

		request.setAttribute("previousOperand", previousOperand); // 過去の操作
		request.setAttribute("currentOperand", currentOperand); // 現在の操作

 		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/calculator.jsp");
 		dispatcher.forward(request, response);
	}
}
