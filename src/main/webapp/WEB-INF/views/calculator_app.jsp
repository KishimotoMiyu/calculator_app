<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>電卓</title>
    <link rel="stylesheet" href="css/calculator.css">
  </head>
  <body>
    <div class="calculator">
    <div class="display">
      <div id="previousOperand" class="previous-operand">${previousOperand}</div>
      <div id="currentOperand" class="current-operand">${currentOperand}</div>
    </div>
      <div class="buttons">
          <button class="btn btn-func" data-action="clear"  value="clear" onclick="get_calc(this)" >✖</button>
          <button class="btn btn-func" data-action="ac" value="ac" onclick="get_calc(this)" >AC</button>
          <button class="btn btn-func" data-action="hugou" value="hugou" onclick="get_calc(this)" >+/-</button>
          <button class="btn btn-op" data-action="÷" value="÷" onclick="get_calc(this)">÷</button>
  
          <button class="btn" data-action="number" value="7" onclick="get_calc(this)">7</button>
          <button class="btn" data-action="number" value="8" onclick="get_calc(this)">8</button>
          <button class="btn" data-action="number" value="9" onclick="get_calc(this)">9</button>
          <button class="btn btn-op" data-action="operator" value="×" onclick="get_calc(this)">×</button>

          <button class="btn" data-action="number" value="4" onclick="get_calc(this)">4</button>
          <button class="btn" data-action="number" value="5" onclick="get_calc(this)">5</button>
          <button class="btn" data-action="number" value="6" onclick="get_calc(this)">6</button>
          <button class="btn btn-op" data-action="operator" value="−" onclick="get_calc(this)">−</button>
  
          <button class="btn" data-action="number" value="1" onclick="get_calc(this)">1</button>
          <button class="btn" data-action="number" value="2" onclick="get_calc(this)">2</button>
          <button class="btn" data-action="number" value="3" onclick="get_calc(this)">3</button>
          <button class="btn btn-op" data-action="operator" value="+" onclick="get_calc(this)">+</button>
  
          <button class="btn btn-zero" data-action="number" value="0" onclick="get_calc(this)">0</button>
          <button class="btn " data-action="decimal" value="." onclick="get_calc(this)">.</button>
          <button class="btn btn-equal" data-action="calculate" value="="onclick="get_calc(this)">=</button>
      </div>
    </div>
    <script type="text/javascript" src="js/calculator.js"></script>
  </body>
</html>
