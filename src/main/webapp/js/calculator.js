let previousOperand = "";
let currentOperand = "";

function get_calc(btn) {
  if(btn.value == "=") {

    const form = document.createElement('form');
    form.action = 'calculator';
    form.method = 'post';

    previousOperand += btn.value;

    const inputPreviousOperand = document.createElement('input');
    inputPreviousOperand.value = previousOperand;
    inputPreviousOperand.name = 'previousOperand';
    inputPreviousOperand.type = 'hidden';
    form.appendChild(inputPreviousOperand);
    document.body.append(form);
    console.log("form",form);
    form.submit();
    
  } else {
      if (btn.value == "clear" || btn.value == "ac") {
          previousOperand = "";
          currentOperand = "0";
          document.getElementById("previousOperand").innerHTML = "";
          document.getElementById("currentOperand").innerHTML = "0";
      } else {
          // if (btn.value == "×") {
          //   btn.value = "*";
          // } else if (btn.value == "÷") {
          //   btn.value = "/";
          // }
      
          if(document.getElementById("currentOperand").innerHTML == "0"){
                previousOperand = btn.value;
                currentOperand = btn.value;
              document.getElementById("currentOperand").innerHTML = btn.value;
          }else{
            previousOperand += btn.value;
            currentOperand += btn.value;
            document.getElementById("currentOperand").innerHTML += btn.value;
          }
        }    
  }
}
